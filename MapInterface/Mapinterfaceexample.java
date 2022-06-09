package MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapinterfaceexample 
{
    public static void main(String[] args) 
    {
        Map<String,Integer> numbers=new HashMap<>();  //these all are generic datatypes
        //insert elements to the map
        numbers.put("a", 1);
        numbers.put("b", 2);
        numbers.put("c", 3);
        numbers.put("d", 4);
        numbers.put("e", 5);

        //Access values of the map
        System.out.println("Values : "+ numbers.values());

        //Access keys of the map
        System.out.println("Keys : "+ numbers.keySet());

        //Access entries of the map
        System.out.println("Entries:"+ numbers.entrySet());

        //remove elements from the map
        numbers.remove("b");
        System.out.println("Remove Two: "+numbers);
        
    }
    
}