package operators;

public class AndOperator1 {

	public static void main(String[] args) {
		
		int a = 40;
		int b = 20; 
		int c = 5;
		
		System.out.println(a<b&&a++<c);
		
		System.out.println(a);
		
		System.out.println(a<b&a++<c);
		
		System.out.println(a);
		

	}

}
