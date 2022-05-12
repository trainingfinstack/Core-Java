package com.javaoops.inheritance;

interface A  
{
    default void text()
    {
   		System.out.println("Hello");
    }
}

interface B   //Second interface
{
    default void text()
    {
   		System.out.println("What's your name?");
    }
}

class C implements A,B
{

	@Override
	public void text() {
		// TODO Auto-generated method stub
		A.super.text();
		B.super.text();
	}

	

 
}

class MultipleInhExamp
{
    public static void main(String args[])
	{
         C obj = new C();
         obj.text();   
    }
}