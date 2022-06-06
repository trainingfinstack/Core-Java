package collections;

import java.util.LinkedList;
import java.util.*;

public class LinkedList
{
    public static void main(String[] args) 
    {
        LinkedList<String> list=new LinkedList<String>();
	    LinkedList<Integer> list1=new LinkedList<Integer>();
	    ArrayList<String> al1=new ArrayList<String>(20);
		list.add("kanhaiya kumar");
		list.add("Hanuman kumar");
		list.add("Rahul singh");
		list.add("railways");
		list.add("India");
		list.add("Java is best");
		System.out.println(list);
		System.out.println(list1);

    }
    
}
