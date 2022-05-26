
class shape
{
	void draw()
	{
		System.out.println("drawing..........");
	}
	}

class Rectangle extends shape
{
	void draw()
	{
		System.out.println("drawing rectangle........");
	}
	}

class Circle extends shape
{
	void draw()
	{
		System.out.println("drawing circle...........");
	}
}

class Hexagon extends shape
{
	void draw()
	{
		System.out.println("drawing hexagon..........");
	}
}


public class Triangle {
	
	public static void main(String args[])
	{
		
		shape s;
		s = new Rectangle();
		s.draw();
		
		s = new Circle();
		s.draw();
		
		s = new Hexagon();
		s.draw();
		
	}

}
