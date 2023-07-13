package com.example.gateway.service;

import com.example.gateway.dtos.LogarithmRequest;
import com.example.gateway.dtos.LogarithmResponse;
import com.example.gateway.dtos.MessageJson;
import com.example.gateway.producer.RabbitMQProducer;
import com.example.gateway.service.client.LogarithmClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Objects;

@Service
public class LogarithmService {
    private LogarithmClient logarithmClient;

    private RabbitMQProducer rabbitMQProducer;

    public LogarithmService(LogarithmClient logarithmClient, RabbitMQProducer rabbitMQProducer) {
        this.logarithmClient = logarithmClient;
        this.rabbitMQProducer = rabbitMQProducer;
    }

    public void calLog(LogarithmRequest req) {
        ResponseEntity<LogarithmResponse> res = logarithmClient.calLog(req);
        LogarithmResponse body = res.getBody();
        if(Objects.nonNull(body)){
            MessageJson msg = MessageJson.builder().createDatetime(new Date())
                    .ans(body.getAnswer()).build();
            rabbitMQProducer.sendMessage(msg);
        }
    }
}
