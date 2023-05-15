package com.example.bff.util;

import com.example.bff.dto.LocationRsDTO;
import com.example.bff.dto.WeatherRqDTO;
import com.example.bff.dto.WeatherRsDTO;

import java.util.ArrayList;
import java.util.List;

public class TestUtil {

    public LocationRsDTO getLocationRsDTO(){
        return LocationRsDTO.builder().build();
    }

    public List<LocationRsDTO> getListLocationRsDTO(){
        List<LocationRsDTO> locationsResDTO = new ArrayList();
        LocationRsDTO l1 = getLocationRsDTO();
        locationsResDTO.add(l1);

        return locationsResDTO;
    }

    public WeatherRqDTO getWeatherRqDTO(){
        return WeatherRqDTO.builder().build();
    }

    public WeatherRsDTO getWeatherRsDTO(){
        return WeatherRsDTO.builder().build();
    }
}
