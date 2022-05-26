
public class TryCatchExample3 {

	public static void main(String[] args) {
		
		try
		{
			int data = 50/0;
			// throws may exception
			
		}

		// handling the exception by using exception class
		catch(ArithmeticException e)
		{
			System.out.println(e);
			
		}
		
			System.out.println("Rest of the code......");
		}
	}


