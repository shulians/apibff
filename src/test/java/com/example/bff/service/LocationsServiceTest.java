package com.example.bff.service;

import com.example.bff.feing.client.proxy.ProxyClient;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class LocationsServiceTest {

    @InjectMocks
    private ILocationsService service;

    @Mock
    private ProxyClient client;

    @Test
    public void getLocationByLocalizedNameTest(){

    }
}
