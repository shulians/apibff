package com.example.bff.service;


import com.example.bff.dto.LocationRsDTO;

import java.util.List;

public interface ILocationsService {
    List<LocationRsDTO> getLocationByLocalizedName(String LocalizedName);
}
