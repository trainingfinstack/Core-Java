package String_handling;

public class subString 
{
    public static void main(String[] args) 
	{
		String str1="International";
		int z=str1.length();
		String x=str1.substring(5);
        //this will print the index of 5 to 10
		String y=str1.substring(5,11);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
    
}
