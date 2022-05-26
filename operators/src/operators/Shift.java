package operators;

public class Shift {

	public static void main(String[] args) {
		
		// For positive no, >> and >>> works same
		
		System.out.println(10>>2);
		
		System.out.println(10>>>2);
		
		// For negative no, >>> changes parity bit MSB to 0
		
		System.out.println(-10>>2);
		
		System.out.println(-10>>>2);
		
		
		

	}

}
