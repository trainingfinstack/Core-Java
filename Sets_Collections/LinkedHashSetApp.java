package Sets_Collections;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHashSetApp 
{
    public static void main(String[] args, ArrayList<Integer> arrayList) {
        ArrayList<Integer> evenNumers=new ArrayList<>();
        evenNumers.add(2);
        evenNumers.add(3);
        System.out.println(evenNumers);

        //creating LinkedHashSet from ArrayList

        LinkedHashSet<Integer> lhs=new LinkedHashSet<>(evenNumers);
        System.out.println(lhs);
    }
    
}
