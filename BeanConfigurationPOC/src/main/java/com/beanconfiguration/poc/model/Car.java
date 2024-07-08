package com.beanconfiguration.poc.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Car {

    private String manufacturer; 
    
    @Autowired
    private Model model;
    
    private Engine engine;
    private String speed; 

    @Autowired
    public Car(Engine engine) {
        this.engine = engine;
    }

	public Car() {
		super();
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public Engine getEngine() {
		return engine;
	}

	@Autowired
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}
	
	@Override
    public String toString() {
        return "Car - { " +
                "manufacturer = '" + manufacturer + '\'' +
                ", model name = '" + model.getName() + '\'' +
                "		Engine - {  "+
                ", type = " + engine.getType() +
                "	} , speed = '" + speed + '\'' +
                '}';
    }    
}
