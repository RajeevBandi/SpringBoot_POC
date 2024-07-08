package com.applicationcontext.poc.model;

public class Employee {
	
	private String name;
	private int employeeId;
	private String role;
	
	
	
	public Employee() {
		super();
	}

	public Employee(String name, int employeeId, String role) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	public void print() {
		System.out.println("{ name: " + this.name + ", employeeId: "+ this.employeeId+", role: "+this.role+" }");
	}

}
