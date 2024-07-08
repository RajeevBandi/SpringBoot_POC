package com.applicationcontext.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.applicationcontext.poc.model.Book;
import com.applicationcontext.poc.model.Employee;

@SpringBootApplication
public class ApplicationContextPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationContextPocApplication.class, args);
		ApplicationContextDemo();
	}
	
	public static void ApplicationContextDemo() {
		 ApplicationContext factory = new ClassPathXmlApplicationContext("Config.xml");
		 		
		// scope singleton (using properties)
		Employee emp1 = (Employee)factory.getBean("employee1");
		
		// scope prototype (using constructor)
		Employee emp2 = (Employee)factory.getBean("employee2");
		
		emp1.print();
		emp2.print();
		
		emp1.setName("David");
		emp1.setRole("intern");
		
		emp2.setName("Harsh");
		emp2.setRole("intern");
		
		// scope singleton (using properties)
		Employee emp3 = (Employee)factory.getBean("employee1");
		
		// scope prototype (using constructor)
		Employee emp4 = (Employee)factory.getBean("employee2");
		
		emp3.print();
		emp4.print();
		
        Book book = factory.getBean(Book.class);
        book.setTitle("War and Peace");
        book.setAuthor("Leo Tolstoy");
        book.setCost(128);
        
        book.print();

	}

}
