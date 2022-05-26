import java.io.*;


	class MyThread extends Thread
	{

		
		public MyThread() {
			// TODO Auto-generated constructor stub
		}

		

		public void run()
		{
			int count =1;
			while(true)
			{
				int count1 = 0;
				System.out.println(count1++);
			
				}
			}
		
		}
	
	
	public class Threadts2 {

	public static void main(String[] args) {
		
		MyThread t = new MyThread();
		t.setDaemon(true);
		t.start();
		
		try 
		{
			Thread.sleep(100);
			}
		
		catch(Exception e){}
		
           
	}

}
	