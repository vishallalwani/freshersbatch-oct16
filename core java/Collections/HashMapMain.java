package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Date
{
	private int day;
	private int month;
	private int year;
	public Date(int day,int month,int year) {
		// TODO Auto-generated constructor stub
		this.day=day;
		this.month=month;
				this.year=year;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.day+"/"+this.month+"/"+this.year;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return day+month;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.day==((Date)obj).day && this.month==((Date)obj).month)
		return true;
		else
			return false;
	}
}

public class HashMapMain {
	public static void main(String[] args) {
			HashMap<Date, String> hm=new HashMap<Date, String>();
			hm.put(new Date(26, 10,2016),"Vishal");
			hm.put(new Date(26, 10,1994),"piyush");
			hm.put(new Date(19, 03,2005),"tim");
			
			
//			Set set = hm.entrySet();
//			Iterator i = set.iterator();
//			while(i.hasNext()) {
//		         Map.Entry me = (Map.Entry)i.next();
//		         System.out.print(me.getKey() + ": ");
//		         System.out.println(me.getValue());
//		      }
			
				System.out.println( hm.get(new Date(26, 10, 1994)));
			
			
	}
	
	
}
