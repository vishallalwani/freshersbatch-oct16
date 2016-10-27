package conn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class ThreadMain {
	public static void main(String[] args) {

		ArrayList<Integer> list=new ArrayList<>();
		list.add(5);
		list.add(9);
		list.add(1);
		Consumer<ArrayList<Integer>> cn=(ArrayList<Integer> l)->
		{Iterator<Integer> itr=list.iterator();
		while(itr.hasNext())
				{
			System.out.println(itr.next());
				}};
				
				
				 Thread printNumbers = new Thread(() -> {
			         		                cn.accept(list);
			            		        });
				 
				 printNumbers.start();
	}
}

