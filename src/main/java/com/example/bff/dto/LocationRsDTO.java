package com.example.bff.dto;

import com.example.bff.feing.rest.proxy.Location;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LocationRsDTO {
    Integer version;
    String key;
    Integer rank;
    String localizedName;
    String country;
    String city;

    public static LocationRsDTO convert (Location toConvert){
        ModelMapper modelMapper = new ModelMapper();

        LocationRsDTO dto = modelMapper.map(toConvert,LocationRsDTO.class);

        return dto;
    }

}
