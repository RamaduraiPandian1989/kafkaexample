package com.kafka.queuecheck.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class ProducerService {

	  @Autowired
	    private KafkaTemplate<String, String> kafkaTemplate;

	    public String sendMessage(String message){
	        System.out.println(String.format("Message sent -> %s", message));
	        kafkaTemplate.send("kafkatest", message);
	        return "Message sent";
	    }
}
