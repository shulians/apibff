package com.example.bff.service;


import com.example.bff.dto.LocationRsDTO;
import com.example.bff.exception.TechnicalException;

import java.util.List;

public interface ILocationsService {
    List<LocationRsDTO> getLocationByLocalizedName(String LocalizedName) throws TechnicalException;
}
