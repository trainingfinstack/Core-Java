package com.javaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.Scanner;

public class JavaPrograms {

	// palindrom number

	static boolean checkPlindrom(int no) {
		int temp = no;
		int sum = 0;
		int r;
		while (temp > 0) {
			r = temp % 10;
			sum = sum * 10 + r;
			temp = temp / 10;
		}
		if (sum == no) {
			return true;
		}
		return false;
	}

	// Armstrong Number

	static boolean checkArmstrong(int no) {
		int temp = no;
		int digit = 0;
		int r;
		int sum = 0;
		while (temp > 0) {
			temp = temp / 10;
			digit++;
		}
		temp = no;
		while (temp > 0) {
			r = temp % 10;
			sum = (int) (sum + Math.pow(r, digit));
			temp = temp / 10;
		}
		if (no == sum) {
			return true;
		} else {
			return false;
		}

	}

	// Prime number

	static boolean checkPrime(int no) {
		int count = 0;
		if (no > 1) {
			for (int i = 1; i <= no / 2; i++) {
				if (no % i == 0) {
					count++;
				}
			}
			if (count == 1) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	// fibonacci Series

	static List<Integer> printFibonacci(int no) {
		List<Integer> fibonacci = new ArrayList<Integer>();
		int n1 = 0;
		int n2 = 1;
		fibonacci.add(n1);
		fibonacci.add(n2);
		int c;
		for (int i = 2; i <= no; i++) {
			c = n1 + n2;
			fibonacci.add(c);
			n1 = n2;
			n2 = c;

		}
		return fibonacci;

	}

	// Anagram

	static boolean checkAnagram(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		char[] s = s1.toLowerCase().toCharArray();
		char[] p = s2.toLowerCase().toCharArray();
		Arrays.sort(s);
		Arrays.sort(p);
		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < s.length; j++) {
				if (s[i] == p[j] && i == j) {
					return true;
				} else {
					return false;
				}
			}

		}
		return false;

	}

	// FACTORIAL

	static int printFactorial(int no) {
		int fact = 1;
		for (int j = 1; j <= no; j++) {
			fact = fact * j;
		}
		return fact;
	}

	// Factorial using Recursion

	static int factorial(int no) {

		if (no == 0) {
			return 1;
		} else {
			return factorial(no * factorial(no - 1));
		}
	}

	// Calculate Electricity Bill

	static double electrikcity(int units) {
		double bill = 0;
		if (units < 100) {
			bill = units * 1.2;
			return bill;
		}
		if (units < 300) {
			bill = units * 1.2 + (units - 100) * 2;
			return bill;
		}
		if (units >= 300) {
			bill = units * 1.2 + (300 - 100) * 2 + (400 - 300 - 100) * 3;
			return bill;
		}
		return bill;
	}

	// Average

	static int printAverage(int no) {
		int[] a = new int[no + 1];
		for (int i = 0; i <= no; i++) {
			a[i] = i;
		}
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		return sum;
	}

	// hcf of two number

	static int claculateHCF(int n1, int n2) {
		int hcf = 1;
		for (int i = 1; i <= n1 && i <= n2; i++) {
			if (n1 % i == 0 && n2 % i == 0) {
				hcf = i;
			}
		}
		return hcf;
	}

	// Check Alphabate is constant or vowel

	static String checkVowelCont(char ch) {
		if (ch == 'a' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'e' || ch == 'A' || ch == 'I' || ch == 'O'
				|| ch == 'U' || ch == 'E') {
			return "vowel";
		}
		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch >= 'z')) {
			return "const";
		} else {
			return "Not a Alphabate";
		}

	}

	// Perfer Number

	static boolean checkPerfectNo(int no) {
		int temp = no;
		int sum = 0;
		for (int i = 1; i < no; i++) {
			if (no % i == 0) {
				sum = sum + i;
			}
		}
		if (temp == sum) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		for (;;) {
			System.out.println("Enter zero to exist  from loop ");
			Scanner sc = new Scanner(System.in);
			System.out.println("Inter a Number");
			int no = sc.nextInt();
			if (no == 0) {
				break;
			}
			boolean a = JavaPrograms.checkPlindrom(no);
			if (a) {
				System.out.println("Number is Palindrom " + no);
			} else {
				System.out.println("Not Palindrom " + no);
			}
			boolean arms = JavaPrograms.checkArmstrong(no);
			if (arms) {
				System.out.println("Number is arm " + no);
			} else {
				System.out.println("Not a Arm Number " + no);
			}

			boolean prime = JavaPrograms.checkPrime(no);
			if (prime) {
				System.out.println("Number is a Prime number " + no);
			} else {
				System.out.println("Number is not prime number " + no);
			}

			// printing prime no from (1-No

			List<Integer> primeNo = new ArrayList<Integer>();
			for (int i = 1; i <= no; i++) {
				if (JavaPrograms.checkPrime(i)) {
					primeNo.add(i);
				}

			}

			// fibonacci Series

			List<Integer> fibonacci = JavaPrograms.printFibonacci(no);
			System.out.println(fibonacci);

			// Anagram number

			boolean b = JavaPrograms.checkAnagram("hanu", "hanu");
			if (b) {
				System.out.println("Strings Are Anagram ");
			} else {
				System.out.println("Strings are not Anagram");
			}

			// factorial

			int fact = JavaPrograms.printFactorial(no);
			System.out.println("factorial of is " + fact);

			// recursive Factorial
			int fact1 = 1;
			fact1 = JavaPrograms.factorial(no);
			System.out.println("Recursivaly factorial is " + fact1);

			// calculate electricity bill;

			double bill = JavaPrograms.electrikcity(no);
			System.out.println("electricity Bill is " + bill);

			// calculate Average

			int average = JavaPrograms.printAverage(no);
			System.out.println("Average is" + average / no);

			// HCF

			int a1 = 31;
			int b1 = 55;
			int hcf = JavaPrograms.claculateHCF(a1, b1);

			// LCM

			System.out.println("LCM IS " + a1 * b1 / hcf);

			// vowel or Const

			System.out.println(JavaPrograms.checkVowelCont('a'));

			// perfect no

			if (JavaPrograms.checkPerfectNo(no)) {
				System.out.println("Number is perfect number");
			} else {
				System.out.println("Not a Perfect Number");
			}

		}
	}
}
