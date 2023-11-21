package com.example.bff.service;

import com.example.bff.dto.WeatherHistoryResDTO;
import com.example.bff.dto.WeatherRqDTO;
import com.example.bff.dto.WeatherRsDTO;
import com.example.bff.exception.TechnicalException;

public interface IWeatherService {
    WeatherRsDTO getWeatherByRQ(WeatherRqDTO rq) throws TechnicalException;

    WeatherHistoryResDTO getWeathers() throws TechnicalException;
}
