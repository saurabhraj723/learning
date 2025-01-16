package com.test.autowire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AutowireApplication {

	public static void main(String[] args) {
		Dev dev;
		ApplicationContext applicationContext= SpringApplication.run(AutowireApplication.class, args);
		dev=applicationContext.getBean(Dev.class);
		dev.take();
	}

}
