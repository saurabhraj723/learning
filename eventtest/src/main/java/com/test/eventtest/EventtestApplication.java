package com.test.eventtest;

import com.test.eventtest.config.AppConfig;
import com.test.eventtest.publisher.SonyPublisher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class EventtestApplication {

	public static void main(String[] args) {

		ApplicationContext context =SpringApplication.run(EventtestApplication.class, args);
//		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
	SonyPublisher sony=	context.getBean("sonyPublisher", SonyPublisher.class);
		sony.HindiShow("Ep-4");
		sony.EnglishShow("Ep-7");

	}

}
