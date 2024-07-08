package com.applicationcontext.poc.model;

import org.springframework.stereotype.Component;

@Component
public class Book {

	private String title;
	private String author;
	private double cost;
	
	public Book() {
		super();
	}

	public Book(String title, String author, double cost) {
		super();
		this.title = title;
		this.author = author;
		this.cost = cost;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public void print() {
		System.out.println("Book - { Title: " + this.title + ", By: "+ this.author+", Cost: "+this.cost+" }");
	}
}
