package com.example.bff.dto;

import com.example.bff.feing.rest.proxy.WeatherCurrentRes;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WeatherCurrentResDTO {
    String locationKey;
    String dateTime;
    String localizedName;
    String country;
    String city;
    String WeatherText;
    Boolean IsDayTime;
    String weatherInMetric;
    String weatherInImperial;

    public static WeatherCurrentResDTO convert (WeatherCurrentRes weatherRes){
        ModelMapper modelMapper = new ModelMapper();

        return modelMapper.map(weatherRes,WeatherCurrentResDTO.class);
    }
}
