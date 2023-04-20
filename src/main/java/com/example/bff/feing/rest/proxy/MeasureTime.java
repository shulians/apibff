package com.example.bff.feing.rest.proxy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MeasureTime {
    Double value;
    String unit;
    Integer unitType;

    public String weather(){
        return value + unit + "°";
    }
}
