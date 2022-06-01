package String_handling;

public class chatApp 
{
    public static void main(String[] args)
    {
        String name="Sanjeev";
        String Message="i am on the way to office";
        Message=name+" said : "+Message;
        System.out.println(Message);
        int i=Message.indexOf(':');
        Message=Message.substring(i);
        Message="you said"+Message;
        System.out.println(Message);
    }
    
}
