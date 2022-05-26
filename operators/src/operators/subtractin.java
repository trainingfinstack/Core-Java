package operators;

import java.util.Scanner;

public class subtractin {

	public static void main(String[] args) {
		 int minus;
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println ("Enter the first no: ");
		 int num_1 = sc.nextInt();
		 
		 System.out.println ("Enter the second no: ");
		 int num_2 = sc.nextInt();
		 sc.close();
		 minus = num_1-num_2;
		 System.out.print(" minus of given numbers: "+ minus);
				 
		

	}

}
