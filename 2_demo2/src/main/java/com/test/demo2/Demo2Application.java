package com.test.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {
		dev dev1;
		ApplicationContext applicationContext= SpringApplication.run(Demo2Application.class, args);
		dev1=applicationContext.getBean(dev.class);
		dev1.greet();

	}

}
