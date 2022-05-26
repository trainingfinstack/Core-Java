package com.ex;
public class Constructor {
	
	// Constructor
	
	Constructor(String name)
	{
		System.out.println("constructor called:");
		name = "programiz";
	}
	
	public static void main(String[] args) {
		
		// constructor is invoked while
		// creating an object of the main class
		
		Main obj = new Main();
		
			
		
		System.out.println("the name is " + obj.name);
		
		
		

	}

}
