package com.javaoops.abstraction;

public class InterfaceExamp {
	
static class ServiceImp implements Services{
	int result;

	@Override
	public int sumsurvice(int a, int b) {
		result=a+b;
		return result;
	}

	@Override
	public int subService(int a, int b) {
		result=a-b;
		return result;
	}

	@Override
	public int multService(int a, int b) {
		result=a*b;
		return result;
	}

	@Override
	public int divService(int a, int b) {
		result=a/b;
		return result;
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Services sr=new ServiceImp();
		System.out.println(sr.divService(12, 32));
		System.out.println(sr.multService(122, 33));
		System.out.println(sr.subService(333, 222));
		System.out.println(sr.subService(232, 334));

	
	}

}
