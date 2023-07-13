package com.example.gateway.consumer;

import com.example.gateway.dtos.MessageJson;
import com.example.gateway.entity.LogarithmAnswer;
import com.example.gateway.repository.LogarithmRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RabbitMQConsumer {
    private LogarithmRepository logarithmRepository;

    public RabbitMQConsumer(LogarithmRepository logarithmRepository) {
        this.logarithmRepository = logarithmRepository;
    }


    @RabbitListener(queues = {"${rabbit.mq.queue.name}"})
    public void consume(MessageJson msg){
        log.info("Recieve msg : {}",msg);
        LogarithmAnswer answer = LogarithmAnswer.builder().answer(msg.getAns())
                .createDatetime(msg.getCreateDatetime()).build();
        logarithmRepository.save(answer);
    }
}
