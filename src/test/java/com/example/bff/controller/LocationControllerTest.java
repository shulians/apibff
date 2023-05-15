package com.example.bff.controller;

import com.example.bff.service.ILocationsService;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class LocationControllerTest {

    @InjectMocks
    private WeatherController controller;

    @Mock
    private ILocationsService service;

}
