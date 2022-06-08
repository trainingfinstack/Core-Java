package Sets_Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Setchecknull 
{
    public static void main(String[] args) 
    {
        HashSet<Integer> hs1=new HashSet<>();
        LinkedHashSet<Integer> lhs1=new LinkedHashSet<Integer>();
		
		hs1.add(null);
		hs1.add(2);
		hs1.add(2);
		hs1.add(2);
		hs1.add(2);  //  Hashset and LinkedHashSet allows only one null to insert we call add many null it will show or take only one .
		hs1.add(2);
		hs1.add(null);
		hs1.add(4);
		hs1.add(44);
		lhs1.add(null);
		lhs1.add(45);
		lhs1.add(50);
		lhs1.add(6);
		lhs1.add(5);
		lhs1.add(3);
		lhs1.add(77);
		lhs1.add(67);
		lhs1.add(null);
		System.out.println(hs1);
		System.out.println(lhs1);
		
        
    }
    
}
