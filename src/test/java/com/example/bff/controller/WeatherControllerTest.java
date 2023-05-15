package com.example.bff.controller;

import com.example.bff.service.IWeatherService;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class WeatherControllerTest {
    @InjectMocks
    private LocationController controller;

    @Mock
    private IWeatherService service;
}
