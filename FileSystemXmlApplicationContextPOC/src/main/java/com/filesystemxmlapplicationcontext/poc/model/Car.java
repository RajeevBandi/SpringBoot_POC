package com.filesystemxmlapplicationcontext.poc.model;

public class Car {

    private String manufacturer; 
    private String model;
    private int year;
    private String color;

    public Car(String manufacturer, String model, int year, String color) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car - { " +
                "manufacturer = '" + manufacturer + '\'' +
                ", model = '" + model + '\'' +
                ", year = " + year +
                ", color = '" + color + '\'' +
                '}';
    }
}