import java.util.*;

abstract class My
{
	abstract public void show();
}
class Tut
{
	public void display()
	{
		class Inner
		{
			public void show()
			{
				My m = new My() 
				{ 
					public void show() 
				{
					System.out.println("hello"); 
			}
				}
				m.show();
			}
		}
		Inner i = new Inner();
		i.show();
	}
}
public class LocalInner {

	public static void main(String[] args) {
	
			Tut t = new Tut();
		t.display();

	}

}
