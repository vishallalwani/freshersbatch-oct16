package multithreading;

public class ExtendingMain extends Thread {
	
	
	public void run() {
		Thread currentThread=Thread.currentThread();
		if(currentThread.getName().equals("PING"))
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("PING");
				try {
					Thread.sleep(300);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		if(currentThread.getName().equals("PONG"))
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("\tPONG");
				try {
					Thread.sleep(800);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		if(currentThread.getName().equals("TONG"))
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("\t\tTONG");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
 

	public static void main(String[] args) {
		new ExtendingMain();
		ExtendingMain t1=new ExtendingMain();
		ExtendingMain t2=new ExtendingMain();
		ExtendingMain t3=new ExtendingMain();
		t1.setName("PING");
		t2.setName("PONG");
		t3.setName("TONG");
		t1.start();
		t2.start();
		t3.start();
		

	}

}
