package com.example.logarithm.service;

import com.example.logarithm.dtos.LogarithmRequest;
import com.example.logarithm.dtos.LogarithmResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LogarithmService {
    public ResponseEntity<LogarithmResponse> calculateLog(LogarithmRequest req) {
        double answer = Math.log(req.getValue()) / Math.log(req.getBase());
        log.info("ANSWER IS : {}",answer);
        return ResponseEntity.ok(
                        LogarithmResponse.builder()
                            .answer(answer)
                            .build());
    }
}
