package collections;
import java.util.*;

public class practiseSet1 
{
    
		ArrayList<String> str=new ArrayList<>(Arrays.asList("Kanhaiya","Mayank","Rahul","Rajan","Manish","raja"));
		ArrayList<String> str1=new ArrayList<>(Arrays.asList("List","Kanhaiya","Loin","Manish","Rinku","Gandhi"));
		
		System.out.println(str);
		System.out.println(str1);
		str.add("Cow");
		str.add("Animal");
		str.add("Goat");
		str1.add("Apple");
		str1.add("Banana");
		System.out.println(str.addAll(str1));
    
}
