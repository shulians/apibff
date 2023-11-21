package com.example.bff.service.impl;

import com.example.bff.dto.WeatherCurrentResDTO;
import com.example.bff.dto.WeatherHistoryResDTO;
import com.example.bff.dto.WeatherRqDTO;
import com.example.bff.dto.WeatherRsDTO;
import com.example.bff.exception.TechnicalException;
import com.example.bff.feing.client.wheater.WeatherClient;
import com.example.bff.feing.rest.proxy.Location;
import com.example.bff.feing.rest.proxy.WeatherRes;
import com.example.bff.feing.rest.proxy.WeatherRq;
import com.example.bff.feing.rest.proxy.WeathersRes;
import com.example.bff.service.IWeatherService;
import com.example.bff.util.ErrorDescriptionUtil;
import com.example.bff.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WeatherServiceImpl implements IWeatherService {
    WeatherClient weatherClient;

    @Autowired
    public WeatherServiceImpl(WeatherClient weatherClient) {
        this.weatherClient = weatherClient;
    }

    @Override
    public WeatherRsDTO getWeatherByRQ(WeatherRqDTO rq) throws TechnicalException {
        WeatherRsDTO response;


        try {
            if(StringUtils.isNullOrIsEmpty(rq.getKey()) && !rq.getCoordinates().isNullOrIsEmpty()){
                rq.setKey(weatherClient.getLocationByGeo(rq.getCoordinates().get()).getKey());
            }

            Location location = weatherClient.getLocationByKey(rq.getKey());
            WeatherRq weatherRq = WeatherRq.builder().location(location).build();

            WeatherRes weatherRes = weatherClient.getByWeatherRq(weatherRq);

            response = WeatherRsDTO.convert(location, weatherRes);

        }catch (Exception e){
            throw new TechnicalException(ErrorDescriptionUtil.E_GENERAL_EXCEPTION_CODE,
                    ErrorDescriptionUtil.E_GENERAL_EXCEPTION);
        }

        return response;
    }

    @Override
    public WeatherHistoryResDTO getWeathers() throws TechnicalException {
        WeatherHistoryResDTO response = WeatherHistoryResDTO.builder().build();

        try {
            WeathersRes weathersRes = weatherClient.getWeathers();

            if(weathersRes != null && !weathersRes.getWeathers().isEmpty()){
                List<WeatherCurrentResDTO> list = new ArrayList<>();
                weathersRes.getWeathers().forEach(item -> list.add(WeatherCurrentResDTO.convert(item)));

                response.setWeathers(list);
            }

        }catch (Exception e){
            throw new TechnicalException(ErrorDescriptionUtil.E_GENERAL_EXCEPTION_CODE,
                    ErrorDescriptionUtil.E_GENERAL_EXCEPTION);
        }

        return response;
    }
}
