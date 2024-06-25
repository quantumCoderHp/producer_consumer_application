package com.example.producerconsumer.service;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.producerconsumer.model.Message;
import com.example.producerconsumer.util.MessageQueue;

class ConsumerServiceTest {

    @InjectMocks
    private ConsumerService consumerService;

    @Mock
    private MessageQueue messageQueue;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testConsume() {
        when(messageQueue.getMessage()).thenReturn(new Message("Test message"));
        consumerService.consume();
    }

    @Test
    void testConsumeNoMessages() {
        when(messageQueue.getMessage()).thenReturn(null);
        consumerService.consume();
    }
}
