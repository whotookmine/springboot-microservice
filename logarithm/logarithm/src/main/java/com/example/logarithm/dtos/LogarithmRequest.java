package com.example.logarithm.dtos;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LogarithmRequest {
    private Double base;
    private Double value;
}
