package com.rabbitmq.producer.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.time.*;
@Service
public class batchProductCall {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Scheduled(cron = "*/5 * * * * *")
    public void callHelloToQueue() {
        System.out.println("Producer call to Queue");

        String message = "[Producer] good morning : " + LocalDateTime.now().toString();
        this.amqpTemplate.convertAndSend("mikeyQueue", message);
    }

}
