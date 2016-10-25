package multithreading;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SyncBallgame extends Frame implements Runnable{
	
	Thread t1, t2, t3;
	int y1 = 400, y2 = 400, y3 = 400;

	public SyncBallgame() {

		super("Ball game");
		setBackground(Color.CYAN);
		setSize(500, 500);
		setVisible(true);

		t1 = new Thread(this);
		t2 = new Thread(this);
		t3 = new Thread(this);

		t1.setName("red");
		t2.setName("green");
		t3.setName("blue");

		t1.start();
		t2.start();
		t3.start();

		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	@Override
	public void paint(Graphics g) {

		g.setColor(Color.RED);
		g.fillOval(100, y1, 50, 50);
		g.setColor(Color.GREEN);
		g.fillOval(200, y2, 50, 50);
		g.setColor(Color.BLUE);
		g.fillOval(300, y3, 50, 50);
	}

	@Override
	public void run() {
		Thread currentThread = Thread.currentThread();
		
	if (currentThread.getName().equals("red")) {
			boolean top = false;
			for (;;) {
				if (top) {
					y1++;
					if (y1 == 400) {
						top = false;
						
						try {
							myfunction();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
	                } else {
	                    y1--;
	                    if (y1 < 50) {

	                        top = true;
	                    	try {
								myfunction();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
	                    }
	                }
	                repaint();
	                try {
	                    Thread.sleep(10);
	                } catch (InterruptedException e) {
	                    // TODO Auto-generated catch block
	                    e.printStackTrace();
	                }
	            }
	        } else if (currentThread.getName().equals("green")) {
	            boolean top = false;
	            for (;;) {
	                if (top) {
	                    y2++;
	                    if (y2 == 400) {
	                        top = false;
	                        try {
								myfunction();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
	                    }
	                } else {
	                    y2--;
	                    if (y2 < 50) {

	                        top = true;
	                    	try {
								myfunction();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
	                    }
	                }
	                repaint();
	                try {
	                    Thread.sleep(20);
	                } catch (InterruptedException e) {
	                    // TODO Auto-generated catch block
	                    e.printStackTrace();
	                }
	            }
	        } else if (currentThread.getName().equals("blue")) {
	            boolean top = false;
	            for (;;) {
	                if (top) {
	                    y3++;
	                    if (y3 == 400) {
	                        top = false;
	                        
	                        myNotify();
	                    }
	                } else {
	                    y3--;
	                    if (y3 < 50) {
	                    	
	                        top = true;
	                        
	                        myNotify();
	                    }
	                }
	                repaint();
	                try {
	                    Thread.sleep(30);
	                } catch (InterruptedException e) {
	                    // TODO Auto-generated catch block
	                    e.printStackTrace();
	                }
	            }
	        }
  
		}
    
	public synchronized void myfunction() throws InterruptedException{	
		wait();
	}
	
	public synchronized void myNotify(){
		notifyAll();
	}
	public static void main(String[] args) {

		Frame mf = new SyncBallgame();
		mf.setSize(500, 500);
		mf.setVisible(true);
	}
}

