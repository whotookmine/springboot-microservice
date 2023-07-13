package com.example.logarithm.controller;

import com.example.logarithm.dtos.LogarithmRequest;
import com.example.logarithm.dtos.LogarithmResponse;
import com.example.logarithm.service.LogarithmService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class LogarithmController {
    private LogarithmService logarithmService;

    public LogarithmController(LogarithmService logarithmService) {
        this.logarithmService = logarithmService;
    }

    @PostMapping
    public ResponseEntity<LogarithmResponse> calLog(@RequestBody LogarithmRequest req){
        return logarithmService.calculateLog(req);
    }
}
