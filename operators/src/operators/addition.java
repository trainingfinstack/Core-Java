package operators;

		import java.util.Scanner;
		
		public class addition{
		
			public static void main(String args[]){
		int sum;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first no: ");
		int num_1 = sc.nextInt();
		
		System.out.print("Enter the second no: ");
		int num_2 = sc.nextInt();
		sc.close();
		sum = num_1 + num_2;
		System.out.print("Sum of given numbers: " + sum);
		
		
			}
		}
		 