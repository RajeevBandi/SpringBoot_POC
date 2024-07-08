package com.beanconfiguration.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.beanconfiguration.poc.model.Car;

@SpringBootApplication
public class BeanConfigurationPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanConfigurationPocApplication.class, args);
		beanConfigurationDemo();
	}
	
	public static void beanConfigurationDemo() {
		Car defaultCar = new Car();
		defaultCar.toString();
	}
}
