import java.util.*;
public class ClassTest {
	
	static boolean isprime (int n)
	{
		for(int i = 2; i < n/2; i++)
		{
			if(n%i == 0)
				return false;
		}
		
		return true;
		
		}
	
	

	public static void main(String[] args) 
	
		{
			
		System.out.println("19 is prime");
		

	}

}
