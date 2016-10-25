package adv_multithread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallablePingPong {
	
	
	

	public static void main(String[] args) throws Exception {
		 
			
			
				Callable<Integer> r1=new Callable<Integer>() {
					
					@Override
					public Integer call() throws InterruptedException {
						// TODO Auto-generated method stub
						for(int i=0;i<10;i++)
						{
							System.out.println("PING");
							
								Thread.sleep(200);
							
						}
						return 1;	
					}
				};
				
			Callable<Integer> r2=new Callable<Integer>() {
					
					@Override
					public Integer call() {
						// TODO Auto-generated method stub
						for(int i=0;i<10;i++)
						{
							System.out.println("\tPONG");
							try {
								Thread.sleep(200);
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						return 1;	
					}
				};
				
			Callable<Integer> r3=new Callable<Integer>() {
					
					@Override
					public Integer call() {
						// TODO Auto-generated method stub
						for(int i=0;i<10;i++)
						{
							System.out.println("\t\tTONG");
							try {
								Thread.sleep(200);
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						return 1;	
					}
				};
			
		ExecutorService executor = Executors.newFixedThreadPool(3);
		Future<Integer> future=executor.submit(r1);
	
		Future<Integer> future1=executor.submit(r2);
		Future<Integer> future2=executor.submit(r3);
		
		int i=future.get();
		int j=future1.get();
		int k=future2.get();
		executor.shutdown();
	}

}
