package com.ex;

public class Main1 {
	
	int i;
	// constructor with no parameter
	
	private Main1()
	{
	int i = 15;
	
		System.out.println("constructor is called");
		
	}

	public static void main(String[] args) {
		
		// calling the constructor without any parameter
		Main1 obj = new Main1();
	    System.out.println("Value of i: " + obj.i);
		
		
		

	}

}
