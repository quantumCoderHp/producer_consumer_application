package com.example.producerconsumer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.producerconsumer.model.Message;
import com.example.producerconsumer.util.MessageQueue;

@Service
public class ConsumerService {

	private static final Logger logger = LoggerFactory.getLogger(ConsumerService.class);

	@Autowired
	private MessageQueue messageQueue;

	public void consume() {
		Message message = messageQueue.getMessage();
		if (message != null) {
			System.out.println("Consumed message: " + message.getContent());
			logger.debug("Consumed message: {}", message);
		} else {
			System.out.println("No messages to consume");
			logger.debug("No messages to consume");
		}
	}
}
