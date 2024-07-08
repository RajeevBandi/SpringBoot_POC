package com.filesystemxmlapplicationcontext.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.filesystemxmlapplicationcontext.poc.model.Car;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;



@SpringBootApplication
public class FileSystemXmlApplicationContextPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileSystemXmlApplicationContextPocApplication.class, args);
		fileSystemXmlApplicationContextDemo();
		
	}
	
	public static void fileSystemXmlApplicationContextDemo() {
		String projectPath = System.getProperty("user.dir"); 
        String configLocation = projectPath + "/src/main/resources/config.xml";

        ApplicationContext context = new FileSystemXmlApplicationContext(configLocation);

        Car myCar = context.getBean("myCar", Car.class);

        System.out.println(myCar);
	}

}
