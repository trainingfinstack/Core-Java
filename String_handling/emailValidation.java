package String_handling;

import java.util.Scanner;

public class emailValidation
{
    public static boolean isValid(String email)
    {
        int i=email.indexOf('@');
        if(i==-1)
        return false;
        int j=email.indexOf('.');
        if(j==-1)
        return false;
        if(i>j)
        return false;
        return true;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter email :");
        String email=sc.nextLine();
        boolean st=isValid(email);
        System.out.println(st);
        
        
    }
    
}
