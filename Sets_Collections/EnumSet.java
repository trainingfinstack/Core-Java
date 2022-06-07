package Sets_Collections;
import java.util.EnumSet;
import java.util.*;

class EnumSet 
{
    enum Size
    {
        //an enum named size
        SMALL,MEDIUM,LARGE,EXTRALARGE
    }
    public static void main(String[] args) {
        //creating EnumSet using allof()
		EnumSet<Size> sizes= EnumSet.allOf(Size.class);
		System.out.println("EnumSet:"+sizes);
		EnumSet<Size> sizes1 = EnumSet.noneOf(Size.class);
		System.out.println("EnumSet:"+sizes1);
		 EnumSet<Size> sizes2 = EnumSet.range(Size.MEDIUM, Size.EXTRALARGE);

	        System.out.println("EnumSet: " + sizes2);
	        EnumSet<Size> sizes3 = EnumSet.of(Size.MEDIUM);
	        System.out.println("EnumSet1: " + sizes3);

	        EnumSet<Size> sizes4 = EnumSet.of(Size.SMALL, Size.LARGE);
	        System.out.println("EnumSet2: " + sizes4);
	    
        
    }
    
}
