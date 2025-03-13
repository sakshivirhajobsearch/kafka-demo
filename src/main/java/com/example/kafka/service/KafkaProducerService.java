package com.example.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

	private static final String TOPIC = "test-topic";

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public String sendMessage(String message) {
		kafkaTemplate.send(TOPIC, message);
		return "Message sent: " + message;
	}
}
