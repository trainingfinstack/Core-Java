package com.javaoops.polymorphism;

public class MethodOverLDExamp {
	   String formatNumber(int value) {
	        return String.format("%d", value);
	    }

	    private String formatNumber(double value) {
	        return String.format("%.5f", value);
	    }

	    private String formatNumber(String value) {
	        return String.format("%.2f", Double.parseDouble(value));
	    }

	   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MethodOverLDExamp hs = new MethodOverLDExamp();
	        System.out.println(hs.formatNumber(500));
	        System.out.println(hs.formatNumber(89.9934));
	        System.out.println(hs.formatNumber("550"));
		 
	}

}
