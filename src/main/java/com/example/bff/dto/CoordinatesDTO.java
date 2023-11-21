package com.example.bff.dto;

import com.example.bff.util.StringUtils;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CoordinatesDTO {
    String latitude;
    String longitude;

    public String get() {
        return latitude + "," + longitude;
    }

    public Boolean isNullOrIsEmpty(){
        return StringUtils.isNullOrIsEmpty(latitude) && StringUtils.isNullOrIsEmpty(longitude);
    }
}