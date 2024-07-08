package com.resources.poc;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneId;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.DefaultResourceLoader;

@SpringBootApplication
public class ResourcesPocApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(ResourcesPocApplication.class, args);
		
		  
		ResourceService resourceService = new ResourceService(new DefaultResourceLoader());
	        String classpathData = resourceService.readFromClasspath("data.txt");

	        // File Writer Service
	        FileWriterService fileWriterService = new FileWriterService();
	        LocalDateTime indiaLocalDateTime = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
	        String writeData = indiaLocalDateTime + "- New data written to output.txt.";
	        fileWriterService.writeToFileSystem("src/main/resources/output.txt", writeData);

	        System.out.println("Data from classpath: " + classpathData);
	}

}
