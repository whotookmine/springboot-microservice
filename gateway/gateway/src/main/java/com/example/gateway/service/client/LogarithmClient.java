package com.example.gateway.service.client;

import com.example.gateway.dtos.LogarithmRequest;
import com.example.gateway.dtos.LogarithmResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "logarithm")
public interface LogarithmClient {
    @PostMapping("/api/v1")
    public ResponseEntity<LogarithmResponse> calLog(@RequestBody LogarithmRequest req);
}
