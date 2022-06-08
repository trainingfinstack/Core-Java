package Sets_Collections;

import java.util.TreeSet;

public class TreeSetApp 
{
    public static void main(String[] args) 
    {
        TreeSet<Integer> numbers=new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(4);
        numbers.add(6);
        System.out.println("TreeSet"+ numbers);
        System.out.println("using higher:"+numbers.higher(4)); //This will print the one higher value from the set
        System.out.println("using lower:"+numbers.lower(4)); //This will print the lateset smallest value from the set
        System.out.println("PollFirst method to remove first element"+numbers.pollFirst());
        System.out.println("PollLast method to remove last element"+numbers.pollLast());
        System.out.println(numbers);
    }
    
}
