package com.use.superkeywords;

public class SuperKeywExamp {
	
	//super keywod invoke parrent class object
	
	static class A{
		int i;
		
	}
	static class B extends A{
		int i=32;
		void show() {
			System.out.println(super.i);
		}
	}
	
	//can be use invoke immediate prarent class method
	
	class C{
		void show1(){
			System.out.println("Parent class");
		}
	}
	class d extends C{
		void display() {
			super.show1();
		}
	}
	
	//can be use invoke immediate parent class constructor
	class E{
		E(){
			System.out.println("Inside E class Constructor");
		}
	}
	class F extends E{
		F(){
			super();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1=new B();
		b1.show();
		
		

	}

}
