package com.example.bff.feing.rest.results;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Result {
    String key;
    String localizedName;
    String country;
    String city;
    String dateTime;
    String weatherInMetric;
    String weatherInImperial;
}
