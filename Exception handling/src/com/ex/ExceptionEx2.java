package com.ex;

public class ExceptionEx2 {

	public static void main(String[] args) {
		try
		{
		String s = null;
		System.out.println(s.length());
	}
	
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException occurs.........");
			
		}
		
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException occurs");
		}
		
		catch(Exception e)
		{
			System.out.println("parent exception occurs");
		}
		
		System.out.println("rest of the code.......");
		

	}

}
