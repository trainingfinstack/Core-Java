
public class Example1 {

	int val1;
	int val2;
	
	// parameterized constructor
	Example1(int val1, int val2)
	{
		this.val1 = val1+val1;
		this.val2 = val2+val2;
	}
	
	
	void display()
	{
		System.out.println("Value val1 = " +val1 + "Value val2 = " +val2);
		
	}
	}
	
class Main
{
	
public static void main(String[] args) {
		
Example1 object = new Example1(5,10);
object.display();
	}

}
