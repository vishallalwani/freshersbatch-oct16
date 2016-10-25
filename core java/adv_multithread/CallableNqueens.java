package adv_multithread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableNqueens {
	static boolean ans=false;
	static int i = 1;
	public static boolean isSafePosition(int y1, int y2, int x1, int x2) {
		if(y1 != y2 && x1 != x2) {
			double slope = ((y2 - y1)*1.0) / (x2 - x1);
			if (slope != 1.0 && slope != -1.0) {
				return true;
			}
		}
		return false;
	}

	
	static String loopfun(int a) {
		
		int a2 = 0, b2 = 1, c2 = 2, d2 = 3, e2 = 4, f2 = 5, g2 = 6, h2 = 7;
		
		
			StringBuilder sb=new StringBuilder();
			for(int b=0; b<=7; b++) {
				for(int c=0; c<=7; c++) {
					for(int d=0; d<=7; d++) {
						for(int e=0; e<=7; e++) {
							for(int f=0; f<=7; f++) {
								for(int g=0; g<=7; g++) {
									for(int h=0; h<=7; h++) {

										if(isSafePosition(a, b, a2, b2) && isSafePosition(a, c, a2, c2) && isSafePosition(a, d, a2, d2) && isSafePosition(a, e, a2, e2) && isSafePosition(a, f, a2, f2) && isSafePosition(a, g, a2, g2) && isSafePosition(a, h, a2, h2)
											&& isSafePosition(b, c, b2, c2) && isSafePosition(b, d, b2, d2) && isSafePosition(b, e, b2, e2) && isSafePosition(b, f, b2, f2) && isSafePosition(b, g, b2, g2) && isSafePosition(b, h, b2, h2)
												&& isSafePosition(c, d, c2, d2) && isSafePosition(c, e, c2, e2) && isSafePosition(c, f, c2, f2) && isSafePosition(c, g, c2, g2) && isSafePosition(c, h, c2, h2)
													&& isSafePosition(d, e, d2, e2) && isSafePosition(d, f, d2, f2) && isSafePosition(d, g, d2, g2) && isSafePosition(d, h, d2, h2)
														&& isSafePosition(e, f, e2, f2) && isSafePosition(e, g, e2, g2) && isSafePosition(e, h, e2, h2) 
															&& isSafePosition(f, g, f2, g2) && isSafePosition(f, h, f2, h2)
																&& isSafePosition(g, h, g2, h2)) {
												
											sb.append("Position " + i + ") " + a + " - " + b + " - " + c + " - " + d + " - " + e + " - " + f + " - " + g + " - " + h+"\n");
											i++;
										}
									}
								}
							}
						}
					}
				}
			
		}
			return sb.toString();
	}
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		long startTime = System.currentTimeMillis();
		
		int a2 = 0, b2 = 1, c2 = 2, d2 = 3, e2 = 4, f2 = 5, g2 = 6, h2 = 7;
		int i = 1;
		
//		for(int a=0; a<=7; a++) {
//			for(int b=0; b<=7; b++) {
//				for(int c=0; c<=7; c++) {
//					for(int d=0; d<=7; d++) {
//						for(int e=0; e<=7; e++) {
//							for(int f=0; f<=7; f++) {
//								for(int g=0; g<=7; g++) {
//									for(int h=0; h<=7; h++) {
//
//										if(isSafePosition(a, b, a2, b2) && isSafePosition(a, c, a2, c2) && isSafePosition(a, d, a2, d2) && isSafePosition(a, e, a2, e2) && isSafePosition(a, f, a2, f2) && isSafePosition(a, g, a2, g2) && isSafePosition(a, h, a2, h2)
//											&& isSafePosition(b, c, b2, c2) && isSafePosition(b, d, b2, d2) && isSafePosition(b, e, b2, e2) && isSafePosition(b, f, b2, f2) && isSafePosition(b, g, b2, g2) && isSafePosition(b, h, b2, h2)
//												&& isSafePosition(c, d, c2, d2) && isSafePosition(c, e, c2, e2) && isSafePosition(c, f, c2, f2) && isSafePosition(c, g, c2, g2) && isSafePosition(c, h, c2, h2)
//													&& isSafePosition(d, e, d2, e2) && isSafePosition(d, f, d2, f2) && isSafePosition(d, g, d2, g2) && isSafePosition(d, h, d2, h2)
//														&& isSafePosition(e, f, e2, f2) && isSafePosition(e, g, e2, g2) && isSafePosition(e, h, e2, h2) 
//															&& isSafePosition(f, g, f2, g2) && isSafePosition(f, h, f2, h2)
//																&& isSafePosition(g, h, g2, h2)) {
//												
//											System.out.println("Position " + i + ") " + a + " - " + b + " - " + c + " - " + d + " - " + e + " - " + f + " - " + g + " - " + h);
//											i++;
//										}
//									}
//								}
//							}
//						}
//					}
//				}
//			}
//		}
		

		
		
		Callable<String> r1=new Callable<String>() {
			
			@Override
			public String call() throws InterruptedException {
				 int a=0;
				String str=loopfun(a);
				
			
					
				
				
				return str;
			
			}

		};
Callable<String> r2=new Callable<String>() {
			
			@Override
			public String call() throws InterruptedException {
				int a=1;
				String str=loopfun(a);
				
					
				
				
				return str;
			
			}
		};
Callable<String> r3=new Callable<String>() {
			
			@Override
			public String call() throws InterruptedException {
			
				int a=2;
				String str=loopfun(a);
					
					
				
				
				return str;
			
			}
		};
Callable<String> r4=new Callable<String>() {
			
			@Override
			public String call() throws InterruptedException {
			
				int a=3;
				String str=loopfun(a);
					
					
				
				
				return str;
			
			}
		};
Callable<String> r5=new Callable<String>() {
			
			@Override
			public String call() throws InterruptedException {
				
				int a=4;
				String str=loopfun(a);
					
					
				
				
				return str;
			
			}
		};
Callable<String> r6=new Callable<String>() {
			
			@Override
			public String call() throws InterruptedException {
				
				int a=5;
				String str=loopfun(a);
								
					
				
				
				return str;
			
			}
		};
Callable<String> r7=new Callable<String>() {
			
			@Override
			public String call() throws InterruptedException {
				
				int a=6;
				String str=loopfun(a);
				
				
				return str;
			
			}
		};
		Callable<String> r8=new Callable<String>() {
			
			@Override
			public String call() throws InterruptedException {
				int a=7;
				String str=loopfun(a);
		
				
				return str;	
			}
		};
		ExecutorService executor = Executors.newFixedThreadPool(3);
		Future<String> future1=executor.submit(r1);
		Future<String> future2=executor.submit(r2);
		Future<String> future3=executor.submit(r3);
		Future<String> future4=executor.submit(r4);
		Future<String> future5=executor.submit(r5);
		Future<String> future6=executor.submit(r6);
		Future<String> future7=executor.submit(r7);
		Future<String> future8=executor.submit(r8);
		
		
			System.out.println(future1.get());
			System.out.println(future2.get());
			System.out.println(future3.get());
			System.out.println(future4.get());
			System.out.println(future5.get());
			System.out.println(future6.get());
			System.out.println(future7.get());
			System.out.println(future8.get());
		
		
		long endTime = System.currentTimeMillis();
		System.out.println("Total time taken: " + (endTime - startTime) + " milisec");
	}

}
