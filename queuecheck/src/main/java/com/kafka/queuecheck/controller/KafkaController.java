package com.kafka.queuecheck.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.queuecheck.service.ProducerService;

@RestController
public class KafkaController {
	
	@Autowired
	private ProducerService producerService;
	
	@GetMapping("/publish/{message}")
	public ResponseEntity<String> publish(@PathVariable String message)
	{
		return new ResponseEntity<String>(producerService.sendMessage(message),HttpStatus.OK);
	}

}
