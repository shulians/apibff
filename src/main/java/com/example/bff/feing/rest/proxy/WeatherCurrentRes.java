package com.example.bff.feing.rest.proxy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WeatherCurrentRes {
    String locationKey;
    String dateTime;
    String localizedName;
    String country;
    String city;
    String WeatherText;
    Boolean IsDayTime;
    String weatherInMetric;
    String weatherInImperial;
}
