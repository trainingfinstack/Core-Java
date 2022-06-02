package lambdaExpression.lambdaExpressionExamples;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class mainApp 
{
    public static void main(String[] args) 
    {
        System.out.println("Printing from the main method");

        //we can create annonymous class like this also
        // myinterface mi1=new myinterface()
        // {

        //     @Override
        //     public int sum(int a, int b) 
        //     {
        //         return a+b;
        //     }

        // };
        // System.out.println(mi1.sum(5,10));

        //using lambda expression will reduce the coding lines
        //using lambda expression will short teh length of programming.
        //we will use the command as lambda expression to make it short and simple.

        myinterface mi=(a,b)->(a+b);
        System.out.println("Result of first addition="+mi.sum(25,50));
        System.out.println("Result of second addition="+mi.sum(5,50));
        
    }
    
}
