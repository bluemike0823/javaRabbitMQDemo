package com.rabbitmq.producer.config;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class RabbitMQConfig {

    @Bean
    public Queue mikeyQueue() {
        return new Queue("mikeyQueue");
    }

}
