package com.javaoops.constructor;

public class SingletonExamp {
	int a=32;
	static SingletonExamp instance=null;

	
	public SingletonExamp() {
		super();
	}
	public static  SingletonExamp getSingleton() {
		if(instance==null) {
			instance=new SingletonExamp();
		}
		return instance;
	}



	@Override
	public String toString() {
		return "SingletonExamp [a=" + a + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonExamp slnt=SingletonExamp.getSingleton();
		System.out.println(slnt.a+10);

	}

}
