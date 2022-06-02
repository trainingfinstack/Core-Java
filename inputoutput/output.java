package inputoutput;
import java.io.*;

public class output
{
    public static void main(String[] args) 
    {
     try 
     {
         FileOutputStream fos=new FileOutputStream("D:\\gitoffice\\Core-Java\\inputoutput\\aa.txt");
         //pass the url of the folder in which you wan to create the code
         //now we want to write the code in the file
         //we will create object of printstream
         PrintStream ps=new PrintStream(fos);
         ps.println("Welcome to noida");
         ps.println("Kanhaiya kumar");
         ps.println("This is an example of IO");
         ps.println("My address is delhi");
     }
    catch (Exception e) 
    {
        System.out.println(e);
    }   
    }

    
}
