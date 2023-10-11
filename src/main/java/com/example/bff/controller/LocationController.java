package com.example.bff.controller;

import com.example.bff.dto.LocationRsDTO;
import com.example.bff.exception.TechnicalException;
import com.example.bff.service.ILocationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/locations")
public class LocationController {
    ILocationsService service;

    @Autowired
    public LocationController(ILocationsService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<LocationRsDTO>> getLocationsByLocalizedName(@RequestParam("localizedName") String LocalizedName) throws TechnicalException {
        return ResponseEntity.ok(service.getLocationByLocalizedName(LocalizedName));
    }
}