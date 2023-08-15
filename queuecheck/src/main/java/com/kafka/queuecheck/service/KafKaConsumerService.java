package com.kafka.queuecheck.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class KafKaConsumerService {
	
	@KafkaListener(topics = "kafkatest",
            groupId = "group_id")
public void consume(String message){
System.out.println(String.format("Message received -> %s", message));
}

}
