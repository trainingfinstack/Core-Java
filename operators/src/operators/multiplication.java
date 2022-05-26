package operators;

import java.util.Scanner;

public class multiplication {

	public static void main(String[] args) {
		
		int multiply;
		
		Scanner sc = new Scanner(System.in);
		 System.out.print ("Enter the first no: ");
		 int num_1 = sc.nextInt();
		 
		 System.out.print ("Enter the second no: ");
		 int num_2 = sc.nextInt();
		 
		 sc.close();
		 multiply = num_1 * num_2;
		 System.out.print("Multiply of given no: " +multiply);

	}

}
