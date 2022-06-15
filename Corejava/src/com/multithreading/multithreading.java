package com.multithreading;

class Hi implements Runnable{
	public void run() {
		for(int i=5;i>0;i--) {
		System.out.println("Hi Sumit");
	 	try {
		Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
	}
	}
}
class Hello implements Runnable{
	public void run() {
		for(int i=5;i>0;i--) {
		System.out.println("Hello Sahil");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}
	}
}


public class multithreading{
	public static void main(String args[]) {
		Hi o1=new Hi();
		Hello o2=new Hello();
		Thread t1=new Thread(o1);
		Thread t2=new Thread(o2);
		t1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
		}
        	t2.start();
		
		
		
			
	}
}