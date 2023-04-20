package com.example.bff.controller;

import com.example.bff.dto.WeatherRqDTO;
import com.example.bff.dto.WeatherRsDTO;
import com.example.bff.service.IWeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
public class WeatherController {
    IWeatherService service;

    @Autowired
    public WeatherController(IWeatherService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<WeatherRsDTO> getCurrentConditionByLocationKey(@RequestBody WeatherRqDTO rq) {
        return ResponseEntity.ok(service.getWeatherByKey(rq));
    }
}
