package com.example.producerconsumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.producerconsumer.util.MessageQueue;

@Configuration
public class AppConfig {
    @Bean
    public MessageQueue messageQueue() {
        return new MessageQueue();
    }
}
