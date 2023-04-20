package com.example.bff.feing.client.proxy;

import com.example.bff.feing.rest.proxy.CurrentConditions;
import com.example.bff.feing.rest.proxy.Location;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(url = "${client.proxy.url}", name = "proxy")
public interface ProxyClient {
    @GetMapping("/currentcondition/{locationKey}")
    CurrentConditions getCurrentConditionByLocationKey(@PathVariable("locationKey")String locationKey);

    @GetMapping("/location")
    List<Location> getLocationByLocalizedName(@RequestParam("localizedName")String localizedName);

    @GetMapping("/location/{key}")
    Location getLocationByKey(@PathVariable("key")String key);

}
