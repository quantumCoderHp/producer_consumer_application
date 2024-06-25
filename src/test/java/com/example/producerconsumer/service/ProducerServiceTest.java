package com.example.producerconsumer.service;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.producerconsumer.model.Message;
import com.example.producerconsumer.util.MessageQueue;

class ProducerServiceTest {

	@InjectMocks
	private ProducerService producerService;

	@Mock
	private MessageQueue messageQueue;

	@BeforeEach
	void setUp() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	void testProduce() {
		// When
		producerService.produce("Test message");
		// Then
		verify(messageQueue, times(1)).addMessage(any());
	}

}
