package com.beanfactory.poc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beanfactory.poc.model.Student;

@SpringBootApplication
public class BeanFactoryPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanFactoryPocApplication.class, args);
		BeanFactoryDemo();
	}

	public static void BeanFactoryDemo() {
		BeanFactory factory = new ClassPathXmlApplicationContext("Config.xml");

		// scope singleton (using properties)
		Student s1 = (Student) factory.getBean("student1");

		// scope prototype (using constructor)
		Student s2 = (Student) factory.getBean("student2");

		s1.print();
		s2.print();

		s1.setName("kevin");
		s2.setName("kevin");

		// scope singleton (using properties)
		Student s3 = (Student) factory.getBean("student1");

		// scope prototype (using constructor)
		Student s4 = (Student) factory.getBean("student2");

		s3.print();
		s4.print();
	}
}
