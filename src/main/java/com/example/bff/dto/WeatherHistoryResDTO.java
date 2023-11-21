package com.example.bff.dto;

import com.example.bff.feing.rest.proxy.Location;
import com.example.bff.feing.rest.proxy.WeatherRes;
import com.example.bff.feing.rest.proxy.WeathersRes;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WeatherHistoryResDTO extends ResponseDTO{
    List<WeatherCurrentResDTO> weathers;
}
