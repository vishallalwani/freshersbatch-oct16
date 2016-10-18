import java.util.*;
class Employee implements Cloneable
	{
		private int day,month,year;
		private String name;

		public Employee(int day,int month,int year,String name)
		{
		  this.day=day;
		  this.month=month;
		  this.year=year;
		  this.name=name;
		}
	public Object clone() {
	try {
	  return super.clone();
	} catch (CloneNotSupportedException e) {
	  return null;
	}
  }
	}
	
	
public class CloneMain 
{
	public static void main(String[] args)
	{
		Employee e=new Employee(19,03,1994,"vishal");
		Employee e1=(Employee)e.clone();
		System.out.println("e hashcode"+e.hashCode());
		System.out.println("e1 hashcode"+e1.hashCode());
	}
}