
public class TryCatchExample {

	public static void main(String[] args) {
		
		try
		{
			int data = 50/0; // throws may exception
			//if exception occurs the remaining statement will not execute
			System.out.println("Rest of the code........");
			
		}
		
		// handling the exception
		catch(ArithmeticException e) {
	
			

		System.out.println(e);
	}

}
}