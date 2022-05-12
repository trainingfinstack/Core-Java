package com.use.thiskeywords;

public class ThisKeywExamp {
	
	//use of this
	
	// invoke current class object
	
	int i;
	void setP(int i) {
		this.i=i;
	}
	void show() {
		System.out.println(i);
	}
	
	//invoke current class method
	
	void display() {
		this.show();
	}
	// invoke current class Constructor
	
	public ThisKeywExamp() {
		System.out.println("hello");
	}
	ThisKeywExamp(int a){
		this();
		System.out.println(a);
	}
	
	//pass an argument in method call
	void m1(ThisKeywExamp td){
		System.out.println("inside m1 method");
	}
	void m2() {
		m1(this);
	}
	
	//pass an argument in constructor call
	class Test{
		public Test(Thisdemo td) {
			System.out.println("Test class ");
		}
	}
	
	
	class Thisdemo{
		void m1() {
			Test t=new Test(this);
		}
	}
	
	//return the current class instance from the method
	
		class Practice{
			int i=12;
			Practice m1() {
				return this;
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeywExamp thisk=new ThisKeywExamp();
		thisk.setP(12);
		thisk.show();

	}

}
