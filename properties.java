import java.util.Properties;
import java.util.*;


public class properties 
{
    public static void main(String[] args) 
    {
        Properties p=new Properties();

        p.setProperty("Brand", "Dell");
        p.setProperty("Processor","i7");
        p.setProperty("os", "Windows10");
        p.setProperty("Model", "Latitude");
        p.store("D:\\self-work\\git office\\Core-Java\\aa.xml","Laptop");
    }

    
}
