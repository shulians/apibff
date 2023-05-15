package com.example.bff.service;

import com.example.bff.feing.client.results.ResultsClient;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class WeatherServiceTest {

    @InjectMocks
    IWeatherService service;

    @Mock
    ResultsClient resultsClient;
    @Test
    public  void getWeatherByKeyTest(){

    }
}
