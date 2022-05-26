
public class TryCatchExample6 {

	public static void main(String[] args) {
		
		try
		{
			int data1 = 50/0; // throws may exception
		}
		
		// handling the exception 
		
		catch(ArithmeticException e)
		{
			// generating the exception in catch block
			
			int data2 = 50/0; // may throw exception
			
			
			
		}
		
		System.out.println("Rest of the code.........");

	}

}
