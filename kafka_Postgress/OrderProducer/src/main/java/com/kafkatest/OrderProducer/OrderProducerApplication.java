package com.kafkatest.OrderProducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
@EnableConfigurationProperties    // not compulsory
public class OrderProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderProducerApplication.class, args);
	}

}
