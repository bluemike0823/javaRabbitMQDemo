package com.rabbitmq.consumer.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class batchConsumerCall {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @RabbitListener(queues = "mikeyQueue")
    public void processMessage(@Payload String message) {
        System.out.println("[Consumer] " + LocalDateTime.now().toString() + " processing message : " + message);
    }

//    @Scheduled(cron = "*/5 * * * * *")
//    public void callHelloFromQueue() {
//        System.out.println("Consumer call from Queue");
//
//        String message = "[Consumer] good morning : " + LocalDateTime.now().toString();
//        this.amqpTemplate.convertAndSend("mikeyQueue", message);
//    }

}
