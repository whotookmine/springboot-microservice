package com.example.logarithm.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class LogarithmResponse {
    private Double answer;
}
