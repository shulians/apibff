package com.example.bff.service.impl;

import com.example.bff.dto.LocationRsDTO;
import com.example.bff.feing.client.proxy.ProxyClient;
import com.example.bff.feing.rest.proxy.Location;
import com.example.bff.service.ILocationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LocationsServiceImpl implements ILocationsService {
    ProxyClient proxyClient;

    @Autowired
    public LocationsServiceImpl(ProxyClient proxyClient) {
        this.proxyClient = proxyClient;
    }

    @Override
    public List<LocationRsDTO> getLocationByLocalizedName(String LocalizedName) {
        List<LocationRsDTO> response = new ArrayList<>();

        List<Location> locations =  proxyClient.getLocationByLocalizedName(LocalizedName);

        if (!locations.isEmpty()) {
            locations.forEach(item -> response.add(LocationRsDTO.convert(item)));
        }

        return response;
    }
}
