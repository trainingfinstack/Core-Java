package com.javaoops.constructor;

import java.util.concurrent.atomic.AtomicInteger;

public class Employee {
	String name;
	private static final AtomicInteger count = new AtomicInteger(0);
	String companyName;
	int id;
	double salary;
	
	public Employee(String name, String companyName, int id, double salary) {
		super();
		this.name = name;
		this.companyName = companyName;
		this.id = id;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", companyName=" + companyName + ", id=" + id + ", salary=" + salary + "]";
	}
	
	
	

}
