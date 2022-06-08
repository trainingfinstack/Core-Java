package Sets_Collections;
import java.util.ListIterator;
import java.util.*;
public class ListIteratorExample2 
{
    public static void main(String[] args) 
    {
        // Creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        System.out.println("ArrayList: " + numbers);

        // Creating an instance of ListIterator
        ListIterator<Integer> iterate = numbers.listIterator();
        iterate.next();
        iterate.next();

        // Using the previous() method
        int number1 = iterate.previous();
        System.out.println("Previous Element: " + number1);

        // Using the previousIndex()
        int index1 = iterate.previousIndex();
        System.out.println("Position of the Previous element: " + index1);
   
        
    }
    
}
