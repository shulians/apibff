package com.example.bff.feing.rest.proxy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WeatherRes {
    String LocalObservationDateTime;
    Temperature Temperature;
    String MobileLink;
    String Link;
    String WeatherText;
    Boolean IsDayTime;
}
