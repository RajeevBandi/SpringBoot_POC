package com.beanconfiguration.poc.model;

import org.springframework.stereotype.Component;

@Component
public class Model {
	private String name="BMW";

	public Model() {
		super();
	}
	
	public Model(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
