package com.ex;

public class TestExceptionPropagation1 {

	
		void m()
		{
		int data = 50/0;
		}
		
		void n()
		{
			m();
			
		}
		
		void p()
		{
			try
			{
				n();
			}
			
			catch(Exception e)
			{
				System.out.println("exception handled");
				
			}
		}
			public static void main(String[] args)
			{
				
				TestExceptionPropagation1 Obj = new TestExceptionPropagation1();
				Obj.p();
				
				System.out.println("normal flow....");
				
			
		}
		
			
		}