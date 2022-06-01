package multi_Threading;

import javax.swing.*;
import java.awt.*;

//programme to stop the blinking message slowly
public class blinkingMessagetime 
{
    JFrame frame=new JFrame();
	JLabel label=new JLabel("Kanhaiya Kumar");
	public blinkingMessagetime()
	{
		frame.setSize(500,500);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,100,150));
		frame.add(label);
		label.setFont(new Font("lucida calligraphy",Font.BOLD,35));
		label.setForeground(Color.red);
		new blinkThread().start();
		frame.setVisible(true);
	}
	class blinkThread extends Thread
	{
		int ctr=500;
		public void run()
		{
			while(true)
			{
				label.setVisible(true);
				try 
				{
					sleep(ctr);
				} 
				catch (Exception ex) 
				{
					System.out.println(ex);
				}
				label.setVisible(false);
				try {
					sleep(ctr);
				} 
				catch (Exception ex) 
				{
					System.out.println(ex);
				}
				ctr--;
				if(ctr==0)
				{
					label.setVisible(true);
					break;
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		new blinkingMessagetime();
		
	}

    
}
