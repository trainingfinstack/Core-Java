package com.ex;

public class TestFinallyBlock1 {

	public static void main(String[] args) {
		
		try
		{
			System.out.println("inside the try block");
			// block code throws divide by zero exception
			
			int data = 25/0;
			System.out.println(data);
		}
		// can not handle arithmetic type exception
		// can only accept null pointer type exception
		
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		
		// executes regardless of exception occurred or not
		finally
		{
			System.out.println("finally block is always executed");
		}
		
		System.out.println("rest of the code.......");

	}

}
