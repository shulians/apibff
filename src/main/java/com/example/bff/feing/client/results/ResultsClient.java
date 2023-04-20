package com.example.bff.feing.client.results;

import com.example.bff.feing.rest.results.Result;
import com.example.bff.feing.rest.results.Results;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(url = "${client.results.url}", name = "result")
public interface ResultsClient {
    @GetMapping
    Results getAll();

    @PostMapping
    void create(@RequestBody Result result);
}
