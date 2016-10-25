package multithreading;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class WaterTank extends Frame implements Runnable{
	Thread t1,t2,t3;
	int y1 = 5;
	String cap="60";
	
	public WaterTank() {
		super(" game");
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
		t1.setName("inlet");
		t2.setName("outlet");
		t3.setName("controller");
		t1.start();
		t2.start();
		t3.start();
	}
		
	public void paint(Graphics g) {
		g.drawRect(150, 100, 200, 300);
		g.setColor(Color.RED);
		
		g.fillRect(150, 200+y1, 200,200-y1);
		g.drawString(cap, 380, 165);
	}

	public static void main(String[] args) {
		Frame mf = new WaterTank();
		mf.setSize(500, 500);
		mf.setVisible(true);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void run() {
		 for(;;)
		    { 
			 Thread currentThread=Thread.currentThread();
			 if(currentThread.getName().equals("inlet"))
			 {
			 try
		      { 
				 Integer i=Integer.parseInt(cap);
				 if(i<85)
				 i=i+1;
				 cap=Integer.toString(i);
		        y1=y1-5;
		        
		        Thread.sleep(400);
		       // repaint();
		      }
		      catch(InterruptedException e)
		      {
		    	  e.printStackTrace();
		      }
			 }
			 
			 if(currentThread.getName().equals("outlet"))
			 {
			 try
		      { 
				 Integer i=Integer.parseInt(cap);
				 i=i-1;
				 cap=Integer.toString(i);
		        y1=y1+7;
		       
		       
		        Thread.sleep(800);
		        repaint();
		      }
		      catch(InterruptedException e)
		      {
		    	  e.printStackTrace();
		      }
			 }
			 
			 if(currentThread.getName().equals("controller"))
			 {
			 try
		      { 
		       
		       if(200-y1>270)
		       {
		    	  t1.suspend();
		       }
		       if(200-y1<220)
		       {
		    	   t1.resume();
		       }
		    	   
		       
		        Thread.sleep(500);
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
