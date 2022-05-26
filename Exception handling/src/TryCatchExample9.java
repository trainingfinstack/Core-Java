
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TryCatchExample9 {

	public static void main(String[] args) {
		
		PrintWriter pw;
		
		try
		{
		pw =  new PrintWriter("jpt.txt"); //may throw exception
		
		pw.println("saved");
		
		}
		
		// providing the checked exception handler
		
		catch(FileNotFoundException e) {
			
		
		
		System.out.println(e);
	
		}
			
		
		System.out.println("File Saved Successfully....");
}

	}


