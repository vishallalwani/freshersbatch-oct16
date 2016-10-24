package multithreading;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class BallGame extends Frame implements Runnable{

		Thread t1, t2, t3;
		int y1 = 400, y2 = 400, y3 = 400;
		
		public BallGame() {
			super("Ball game");
			setBackground(Color.CYAN);
			setSize(500, 500);
			setVisible(true);
			this.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
			t1=new Thread(this);
			
			t2=new Thread(this);
			
			t3=new Thread(this);
			t1.setName("ball1");
			t2.setName("ball2");
			t3.setName("ball3");
			t1.start();
			t2.start();
			t3.start();
			
		}
		
		public void paint(Graphics g) {
			g.setColor(Color.RED);
			g.fillOval(100, y1, 50, 50);
			g.setColor(Color.GREEN);
			g.fillOval(200, y2, 50, 50);
			g.setColor(Color.BLUE);
			g.fillOval(300, y3, 50, 50);
		}

	public static void main(String[] args) {
		Frame mf = new BallGame();
		mf.setSize(500, 500);
		mf.setVisible(true);
	}

	@Override
	public void run() {
		 for(;;)
		    { 
			 Thread currentThread=Thread.currentThread();
			 if(currentThread.getName().equals("ball1"))
			 {
			 try
		      { 
		        y1=y1-2;
		        
		        Thread.sleep(400);
		        repaint();
		      }
		      catch(InterruptedException e)
		      {
		    	  e.printStackTrace();
		      }
			 }
			 
			 if(currentThread.getName().equals("ball2"))
			 {
			 try
		      { 
		      
		        y2=y2-2;
		       
		       
		        Thread.sleep(600);
		        repaint();
		      }
		      catch(InterruptedException e)
		      {
		    	  e.printStackTrace();
		      }
			 }
			 
			 if(currentThread.getName().equals("ball3"))
			 {
			 try
		      { 
		       
		        y3=y3-2;
		       
		        Thread.sleep(900);
		        repaint();
		      }
		      catch(InterruptedException e)
		      {
		    	  e.printStackTrace();
		      }
			 }
		    }
		 
		
	}

}
