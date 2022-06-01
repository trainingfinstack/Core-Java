package multi_Threading;

public class Task implements Runnable
{
    public void run() 
    {
        int num=2;
        for(int i=1;i<=10;i++)
        {
            int ta=2*i;
            System.out.print(ta+" ");
        }
    }
    
    public static void main(String[] args) 
    {
     Task t1=new Task();
     Thread th1=new Thread(t1);
     th1.start();
     Thread th2=new Thread(t1);
     th2.start();
     Thread th3=new Thread(t1);
     th3.start();   
    }
    
}
