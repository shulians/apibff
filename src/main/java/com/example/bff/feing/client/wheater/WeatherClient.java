package com.example.bff.feing.client.wheater;

import com.example.bff.feing.rest.proxy.Location;
import com.example.bff.feing.rest.proxy.WeatherRes;
import com.example.bff.feing.rest.proxy.WeatherRq;
import com.example.bff.feing.rest.proxy.WeathersRes;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(url = "${feign.wheater.url}", name = "wheater")
public interface WeatherClient {
    @RequestMapping(method = RequestMethod.GET, value = "/location/{key}")
    Location getLocationByKey(@PathVariable("key")String key);

    @RequestMapping(method = RequestMethod.GET, value = "/location/geoposition/{geo}")
    Location getLocationByGeo(@PathVariable("geo")String geo);

    @RequestMapping(method = RequestMethod.POST, value = "/current")
    WeatherRes getByWeatherRq(@RequestBody WeatherRq rq);

    @RequestMapping(method = RequestMethod.GET, value = "/current/history")
    WeathersRes getWeathers();
}
