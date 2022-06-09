package abstractions;

import java.util.Scanner;

public class App 
{
    public static void main(String[] args) 
    {
        demoAbstract sh=null;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("please enter your choice to perform operation");
        System.out.println("==================================================");
        System.out.println("1. Adddition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Quit");
        System.out.print("please enter your choice :");
        int ch=sc.nextInt();
        if(ch==1)
        {
            System.out.println("Enter first Number=");
            int a=sc.nextInt();
            System.out.println("Enter Second number=");
            int b=sc.nextInt();
            sh=new addition();
            sh.maths(a, b);
        }
        if(ch==2)
        {
            System.out.println("Enter first Number=");
            int a=sc.nextInt();
            System.out.println("Enter Second number=");
            int b=sc.nextInt();
            sh=new substract();
            sh.maths(a, b);
        }
        if(ch==3)
        {
            System.out.println("Enter first Number=");
            int a=sc.nextInt();
            System.out.println("Enter Second number=");
            int b=sc.nextInt();
            sh=new multiplication();
            sh.maths(a, b);
        }
        if(ch==4)
        {
            
        }
    

        
    }    
}
