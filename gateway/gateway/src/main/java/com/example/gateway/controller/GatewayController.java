package com.example.gateway.controller;

import com.example.gateway.dtos.LogarithmRequest;
import com.example.gateway.service.LogarithmService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class GatewayController {
    private LogarithmService logarithmService;

    public GatewayController(LogarithmService logarithmService) {
        this.logarithmService = logarithmService;
    }

    @PostMapping
    public void calLog(@RequestBody LogarithmRequest req){
        logarithmService.calLog(req);
    }
}
