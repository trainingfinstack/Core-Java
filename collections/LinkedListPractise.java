package collections;
import java.util.LinkedList;
import java.util.*;
public class LinkedListPractise
{
    public static void main(String[] args) 
    {
         // Creating list using the LinkedList class
         LinkedList<Integer> numbers = new LinkedList<>();

         // Add elements to the list
         numbers.add(1);
         numbers.add(2);
         numbers.add(3);
         System.out.println("List: " + numbers);
 
         // Access element from the list
         int number = numbers.get(2);
         System.out.println("Accessed Element: " + number);
 
         // Using the indexOf() method
         int index = numbers.indexOf(2);
         System.out.println("Position of 3 is " + index);
 
         // Remove element from the list
         int removedNumber = numbers.remove(1);
         System.out.println("Removed Element: " + removedNumber);
    }
    
}
