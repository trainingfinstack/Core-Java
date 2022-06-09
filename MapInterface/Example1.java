package MapInterface;

import java.util.Map;
import java.util.TreeMap;

public class Example1 
{
    public static void main(String[] args) 
    {
        //creating Map using TreeMap
        Map<String,Integer> values=new TreeMap<>();

        //Insert elements to map
        values.put("Second", 2);
        values.put("first", 1);
        System.out.println("Map using TreeMap: "+values);

        //Replacing the values
        values.replace("First", 11);
        values.replace("Second", 22);
        System.out.println("New Map: " + values);

        // Remove elements from the map
         values.remove("First");
        System.out.println("Removed Value: " +values);        
    }
    
}
