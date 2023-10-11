package com.example.bff.controller;

import com.example.bff.dto.WeatherRsDTO;
import com.example.bff.exception.TechnicalException;
import com.example.bff.service.ILocationsService;
import com.example.bff.util.TestUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.Assert;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class LocationControllerTest {

    @InjectMocks
    private LocationController controller;

    @Mock
    private ILocationsService service;

    @Test
    public void getLocationsByLocalizedNameTest() throws TechnicalException {
        WeatherRsDTO response = TestUtil.getWeatherRsDTO();

        when(service.getLocationByLocalizedName(TestUtil.KEY)).thenReturn();

        Assert.assertEquals(controller.getLocationsByLocalizedName(TestUtil.getBody(), response);
    }
}
