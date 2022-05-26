

class Animal
{
	void eat()
	{
		System.out.println("eating.....");
	}
}

class Dog extends Animal
{
	void eat()
	{
		System.out.println("eating bread...........");
	}
	
}

class Cat extends Animal
{
	void eat()
	{
		System.out.println("eating milk......");
	}
}

class Lion extends Animal
{
	void eat()
	{
		
	System.out.println("eating meat.........");
}
}


public class PolymorphismEx {

	public static void main(String[] args) {
		
		Animal a;
		a = new Dog();
		
		a.eat();
		a = new Cat();
		
		a.eat();
		a = new Lion();
		
		a.eat();
		

	}

}
