package com.example.bff.service;

import com.example.bff.dto.WeatherRqDTO;
import com.example.bff.dto.WeatherRsDTO;
import com.example.bff.exception.TechnicalException;

public interface IWeatherService {
    WeatherRsDTO getWeatherByKey(WeatherRqDTO rq) throws TechnicalException;
}
