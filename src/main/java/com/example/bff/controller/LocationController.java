package com.example.bff.controller;

import com.example.bff.dto.LocationRsDTO;
import com.example.bff.dto.WeatherRqDTO;
import com.example.bff.dto.WeatherRsDTO;
import com.example.bff.service.ILocationsService;
import com.example.bff.service.IWeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/location")
public class LocationController {
    ILocationsService service;

    @Autowired
    public LocationController(ILocationsService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<LocationRsDTO>> getLocationsByLocalizedName(@RequestParam("localizedName") String LocalizedName) {
        return ResponseEntity.ok(service.getLocationByLocalizedName(LocalizedName));
    }
}