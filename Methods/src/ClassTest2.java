import java.util.*;
public class ClassTest2 {
	
	static int max(int x, int y)
	{
		return x>y?x:y;
	}
	
	static float max(float x, float y)
	{
		if(x>y) {
		
		return x;
		}
		else {
			return y;
		}
	}
	public static void main(String[] args) {
		
System.out.println(max(19.5f, 33.2f));
	}

}
