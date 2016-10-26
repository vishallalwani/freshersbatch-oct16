package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class ArrayListMain {
	public static void main(String[] args) {
		List<Integer> set=new ArrayList<Integer>();
		set.add(10);
		set.add(4);
		set.add(15);
		set.add(100);
		set.add(8);
		
		
		System.out.println("-----------FORWARD");
		ListIterator<Integer> itr=set.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		
		System.out.println("-----------BACKWARD");
		while(itr.hasPrevious())
		      System.out.println(itr.previous());
	}
}
