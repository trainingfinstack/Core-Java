
public class TryCatchExample5 {

	public static void main(String[] args) {
		
		int i = 100;
		int j = 0;
		int data;
		
		try
		{
			data = i/j; // throws may exception
		}
		
			// handling the exception
			
			catch(ArithmeticException e)
			{
				// resolving the exception in catch block
				System.out.println(i/(j+2));
			}
			
		
}
}