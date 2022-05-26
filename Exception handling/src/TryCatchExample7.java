
public class TryCatchExample7 {

	public static void main(String[] args) {
	
		try
		{
			int data = 50/0; // throw may exception
		}

		// try to handle the Arithmetic Exception using Array index out of bounds Exception
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			
		}
		System.out.println("Rest of the code....");
		}
		
	}


