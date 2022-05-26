package com.ex;
import java.io.*;

void method()throws2 IOException
{
	
	
	throw new IOException("device error");
}
}


public class TestThrows2 {
	
	

	public static void main(String[] args) {
		
		try
		{
			M m = new M();
			m.method();
		}
			
			catch(Exception e)
			{
				System.out.println("exception handled");
				
			}
			
			System.out.println("normal flow.......");
			
	

	}

}
