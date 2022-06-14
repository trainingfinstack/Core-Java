package inheritanceShapeAreas;

import java.util.Scanner;
import java.util.concurrent.CyclicBarrier;

public class App 
{
    public static void main(String[] args) 
    {
        Shapes sh=null;
        System.out.println("Please choose any one of the Following");
        System.out.println("1.Find the Area of Circle");
        System.out.println("2.Find the Area of Rectangle");
        System.out.println("3.Find the Area of Square");
        System.out.println("4.Find the Area of Cylinder");
        Scanner sc=new Scanner(System.in);
        System.out.println("please Enter your choice :");
        int ch=sc.nextInt();
        
        switch(ch)
        {
            case 1:
            {
                System.out.println("please enter the radius =");
                int r=sc.nextInt();
                sh=new Circle(r);
                sh.findShapeArea();
                break;
            }
            case 2:
            {
                System.out.println("please Enter the length =");
                int l=sc.nextInt();
                System.out.println("please Enter the breadth =");
                int b=sc.nextInt();
                sh=new Rectangle(l, b);
                sh.findShapeArea();
                break;
            }
            case 3:
            {
                System.out.println("please enter the length of side=");
                int s=sc.nextInt();
                sh=new Square(s);
                sh.findShapeArea();
                break;
            }
            case 4:
            {
                System.out.println("Enter radius =");
                int r=sc.nextInt();
                System.out.println("Enter height =");
                int h=sc.nextInt();
                sh=new cylinder(r, h);
                sh.findShapeArea();
                break;
            }
        }
        

        
    }
    
}
