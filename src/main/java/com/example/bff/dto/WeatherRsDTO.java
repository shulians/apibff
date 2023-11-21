package com.example.bff.dto;

import com.example.bff.feing.rest.proxy.Location;
import com.example.bff.feing.rest.proxy.WeatherRes;
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
    String weatherText;
    Boolean isDayTime;

    public static WeatherRsDTO convert (Location location, WeatherRes weatherRes){
        ModelMapper modelMapper = new ModelMapper();
        WeatherRsDTO dto = modelMapper.map(location, WeatherRsDTO.class);

        dto.setWeatherInMetric(weatherRes.getTemperature().getMetric().weather());
        dto.setWeatherInImperial(weatherRes.getTemperature().getImperial().weather());
        dto.setDateTime(weatherRes.getLocalObservationDateTime());
        dto.setWeatherText(weatherRes.getWeatherText());
        dto.setIsDayTime(weatherRes.getIsDayTime());

        return dto;
    }
}
