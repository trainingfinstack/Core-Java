package com.ex;

public class TestThrow1 {

	
		
		// function to check if person is eligible for vote or not
		
		public static void validate(int age)
		{
			if(age<18)
			{
				
				// throw Arithmetic exception if not eligible to vote 
				
				throw new ArithmeticException("person is not eligible to vote");
			}
			
			else
			{
				System.out.println("person is eligible to vote !!");
			}
		}
		
		// main method 
		
		public static void main (String[] args)
		
		{
			// calling the function
			
			validate(13);
			
			System.out.println("rest of the code........");				
				
		

	}

}
