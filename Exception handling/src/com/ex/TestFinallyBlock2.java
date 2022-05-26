package com.ex;

public class TestFinallyBlock2 {

	public static void main(String[] args) {
		
		try
		{
			System.out.println("inside try block");
			// below code throws divide by zero exception
			
			int data = 25/0;
			System.out.println(data);
		}
		
		//handles the arithmetic exception / divide by zero exception
		
		catch(ArithmeticException e)
		
		
		{
			System.out.println("exception handled");
			System.out.println(e);
		}
		// executes regardless of exception occured or not
		finally
		
		{
			
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code");

	}

}
