package com.javaoops.polymorphism;

class Bank{  
int getRateOfInterest(){return 0;}  
}  
//Creating child classes.  
class SBI extends Bank{
	int getRateOfInterest() {
		return 7;
	}
}
class ICICI extends Bank{
	int getRateOfInterest() {
		return 8;
	}
}
class AXIS extends Bank{
	int getRateOfInterest() {
		return 7;
	}
}
class PNB extends Bank{
	int getRateOfInterest() {
		return 8;
	}
}
//Test class to create objects and call the methods  
public class MethodoverRDExamp{  
public static void main(String args[]){  
SBI s=new SBI();  
ICICI i=new ICICI();  
AXIS a=new AXIS();  
PNB p=new PNB();
System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());  
System.out.println("AXIS Rate of Interest: "+p.getRateOfInterest());
}  
}  