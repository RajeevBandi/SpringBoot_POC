package com.beanconfiguration.poc.model;

public class Engine {
	private String type = "default";
	
	public Engine() {
		super();
	}

	public Engine(String type) {
		super();
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


}
