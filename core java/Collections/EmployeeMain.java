package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Employee
{
	String name;
	public Employee(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 5;
	}
	
	@Override
	public boolean equals(Object obj) {
		return true;
		
	}
}

public class EmployeeMain {
	public static void main(String[] args) {
			HashMap<Employee, String> hm=new HashMap<Employee, String>();
			hm.put(new Employee("xor"),"Vishal");
			hm.put(new Employee("PUNE"),"piyush");
			hm.put(new Employee("Baner"),"tim");
			
			
//			Set set = hm.entrySet();
//			Iterator i = set.iterator();
//			while(i.hasNext()) {
//		         Map.Entry me = (Map.Entry)i.next();
//		         System.out.print(me.getKey() + ": ");
//		         System.out.println(me.getValue());
//		      }
			Iterator<Employee >itr = hm.keySet().iterator();
			while(itr.hasNext()) {
				Employee key = itr.next();
				System.out.println(key + " - " + hm.get(key));
			}
			
	}
	
	
}
