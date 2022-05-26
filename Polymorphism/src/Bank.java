import java.io.*;
class Banks {
	
	float getRateOFInterest()
	{
		return 0;
	}
	}

class SBI extends Banks
{
	float getRateOFInterest()
	{
		return 8.4f;
	}
	}


class ICICI extends Banks
{
	float getRateOFInterest()
	{
		return 7.24f;
	}
	}

class AXIS extends Banks
{
	float getRateOFInterest()
	{
		return 7.54f;
	}

public class Bank
{
	

	
	public static void main(String[] args) {
		
		Bank b;  
		
		b = new Bank();  
		System.out.println("SBI Rate of Interest: " +b.getRateOFInterest());  
		
		b = new Bank();  
		System.out.println("ICICI Rate of Interest: " +b.getRateOFInterest());  
		
		b = new Bank();  
		System.out.println("AXIS Rate of Interest: " +b.getRateOFInterest());  
	


}

	private String getRateOFInterest() {
		// TODO Auto-generated method stub
		return null;
	}
}
}