
public class Exception {

	public static void main(String[] args) {
	
		try
		{
			// Code that may raise exception
			
			int data = 100/0;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
			
		}
		
		// Rest of the code.........
		
		System.out.println("rest of the code...");
	}
	}


