import java.io.*;
public class Animal2 {
	
	void eat()
	{
		System.out.println("eating.........");
	}
}

class Dog extends Animal2
{
	void eat()
	{
		System.out.println("eating fruits.....");
	}
}

class BabyDog extends Dog
{
	void eat()
	{
		System.out.println("drinking milk.......");
	}
	


	public static void main(String[] args) {
	
		Animal a1;
		Dog a2;
		BabyDog a3;
		a1 = new Animal();
		a2 = new Dog();
		a3 = new BabyDog();
		
		a1.eat();
		a2.eat();
		a3.eat();
		

	}

}
