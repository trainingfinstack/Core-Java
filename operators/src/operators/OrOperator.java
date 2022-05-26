package operators;

public class OrOperator {

	public static void main(String[] args) {
		
		int a = 40;
		int b = 20;
		int c = 10;
		
		System.out.println(a>b|| a<c);
		
		System.out.println(a>b| a<c);
		
		System.out.println(a>b||a++<c);
		System.out.println(a);
		
		
		System.out.println(a>b| a++<c);
		System.out.println(a);
		

	}

}