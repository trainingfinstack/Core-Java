package abstractions;

public class addition implements demoAbstract
{

    @Override
    public void maths(int a, int b) 
    {
        int result=a+b;
        System.out.println("Addition :"+result); 
    }
    
}
