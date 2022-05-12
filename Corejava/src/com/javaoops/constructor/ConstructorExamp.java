package com.javaoops.constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ConstructorExamp {
	
	//Default Constructor
	//Paramererized Constructor
	//copy Constructor
	//private constructor
	

	public static void main(String[] args) {
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee("hanu","ezmata tech",123,32324));
		list.add(new Employee("sahani","ezmata tech",22,32324));
		list.add(new Employee("jay","ezmata tech",123,32324));
		list.add(new Employee("azzu","ezmata tech",123,32324));
		list.add(new Employee("anu","ezmata tech",123,32324));
		list.add(new Employee("priya","ezmata tech",123,32324));
		list.add(new Employee("sinddu","ezmata tech",123,32324));
		list.add(new Employee("atlas","ezmata tech",123,32324));
		list.add(new Employee("add","ezmata tech",123,32324));
		list.add(new Employee("dfu","ezmata tech",123,32324));
		ListIterator<Employee> ls=list.listIterator();
		while(ls.hasNext()) {
			System.out.println(ls.next().toString());
		}

	}

}
