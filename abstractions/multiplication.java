package abstractions;

public class multiplication implements demoAbstract
{

    @Override
    public void maths(int a, int b) 
    {
        int result=a*b;
        System.out.println("Mulitpliaction :"+result);
        
    }
    
}
