package com.example.bff.service;

import com.example.bff.dto.WeatherRqDTO;
import com.example.bff.dto.WeatherRsDTO;

public interface IWeatherService {
    WeatherRsDTO getWeatherByKey(WeatherRqDTO rq);
}
