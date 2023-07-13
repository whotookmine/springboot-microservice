package com.example.gateway.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class LogarithmResponse {
    private Double answer;
    private String random;
}
