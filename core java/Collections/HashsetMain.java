package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashsetMain {
	public static void main(String[] args) {
		Set<Integer> set=new HashSet<Integer>();
		set.add(10);
		set.add(4);
		set.add(15);
		set.add(100);
		set.add(8);
		
		Iterator<Integer> itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		
		
		System.out.println("\nLINKED HASH SET");
		Set<Integer> set1=new LinkedHashSet<Integer>();
		set1.add(10);
		set1.add(4);
		set1.add(15);
		set1.add(100);
		set1.add(8);
		
		Iterator<Integer> itr1=set1.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
			
		}
		
		
	}
}
