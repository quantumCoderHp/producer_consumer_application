package com.example.producerconsumer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.producerconsumer.model.Message;
import com.example.producerconsumer.util.MessageQueue;

@Service
public class ProducerService {

	private static final Logger logger = LoggerFactory.getLogger(ProducerService.class);

	@Autowired
	private MessageQueue messageQueue;

	public void produce(String content) {
		Message message = new Message(content);
		messageQueue.addMessage(message);
		logger.debug("Produced message: {}", content);
	}
}
