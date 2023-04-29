package com.example.bff.service.impl;

import com.example.bff.dto.WeatherRqDTO;
import com.example.bff.dto.WeatherRsDTO;
import com.example.bff.exception.TechnicalException;
import com.example.bff.feing.client.proxy.ProxyClient;
import com.example.bff.feing.client.results.ResultsClient;
import com.example.bff.feing.rest.proxy.CurrentConditions;
import com.example.bff.feing.rest.proxy.Location;
import com.example.bff.feing.rest.results.Result;
import com.example.bff.service.IWeatherService;
import com.example.bff.util.ErrorDescriptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherServiceImpl implements IWeatherService {
    ProxyClient proxyClient;
    ResultsClient resultsClient;

    @Autowired
    public WeatherServiceImpl(ProxyClient proxyClient, ResultsClient resultsClient) {
        this.proxyClient = proxyClient;
        this.resultsClient = resultsClient;
    }

    @Override
    public WeatherRsDTO getWeatherByKey(WeatherRqDTO rq) throws TechnicalException {
        WeatherRsDTO response;
        try {
            Location location = proxyClient.getLocationByKey(rq.getKey());
            CurrentConditions conditions = proxyClient.getCurrentConditionByLocationKey(location.getKey());

            String key = location.getKey();
            String localizedName = location.getLocalizedName();
            String country = location.getCountry();
            String city = location.getCity();
            String dateTime = conditions.getLocalObservationDateTime();
            String weatherInMetric = conditions.getTemperature().getMetric().weather();
            String weatherInImperial = conditions.getTemperature().getImperial().weather();

            Result rs = Result.builder()
                    .key(key)
                    .localizedName(localizedName)
                    .country(country)
                    .city(city)
                    .dateTime(dateTime)
                    .weatherInMetric(weatherInMetric)
                    .weatherInImperial(weatherInImperial).build();

            resultsClient.create(rs);

            response = WeatherRsDTO.convert(rs);

        }catch (Exception e){
            throw new TechnicalException(ErrorDescriptionUtil.E_GENERAL_EXCEPTION_CODE,
                    ErrorDescriptionUtil.E_GENERAL_EXCEPTION);
        }

        return response;
    }
}
