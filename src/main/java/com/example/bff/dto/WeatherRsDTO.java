package com.example.bff.dto;

import com.example.bff.feing.rest.results.Result;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WeatherRsDTO {
    String key;
    String localizedName;
    String country;
    String city;
    String DateTime;
    String weatherInMetric;
    String weatherInImperial;

    public static WeatherRsDTO convert (Result toConvert){
        ModelMapper modelMapper = new ModelMapper();

        WeatherRsDTO dto = modelMapper.map(toConvert,WeatherRsDTO.class);

        return dto;
    }
}
