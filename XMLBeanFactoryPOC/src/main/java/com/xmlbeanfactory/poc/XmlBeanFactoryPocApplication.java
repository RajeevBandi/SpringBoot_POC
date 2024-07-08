package com.xmlbeanfactory.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.core.io.ClassPathResource;

import com.xmlbeanfactory.poc.model.Rectangle;

@SpringBootApplication
public class XmlBeanFactoryPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(XmlBeanFactoryPocApplication.class, args);
	}
	
	public static void xmlBeanFactoryDemo() {
		 XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));

	        // Get bean from the factory
	        Rectangle rectangle = (Rectangle) factory.getBean("rectangle");

	        // Use the bean to calculate the area
	        double area = rectangle.calculateArea();

	        // Print the area
	        System.out.println("Area of the rectangle: " + area);
	}

}
