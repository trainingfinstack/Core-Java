package operators;

public class AndOperator {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 5;
		
		System.out.println(a<b && a<c); //false && true
		
		System.out.println(a<b & a<c); //false & true
		
		

	}

}
