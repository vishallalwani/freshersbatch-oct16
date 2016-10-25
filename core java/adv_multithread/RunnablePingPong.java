package adv_multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnablePingPong {
	
	
	

	public static void main(String[] args) {
		 
			
			
				Runnable r1=new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
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
				};
				
			Runnable r2=new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						for(int i=0;i<10;i++)
						{
							System.out.println("\tPONG");
							try {
								Thread.sleep(300);
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}	
					}
				};
				
			Runnable r3=new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						for(int i=0;i<10;i++)
						{
							System.out.println("\t\tTONG");
							try {
								Thread.sleep(300);
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}	
					}
				};
			
		ExecutorService executor = Executors.newFixedThreadPool(3);
		executor.execute(r1);
		executor.execute(r2);
		executor.execute(r3);
		executor.shutdown();

	}

}
