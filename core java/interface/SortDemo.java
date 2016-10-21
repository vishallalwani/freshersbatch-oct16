interface Sortable
{  
	boolean compare(Sortable s1);
		int get();
}  
  
class Circle implements Sortable
{  
	public int radius;
	public Circle(int radius)
	{
		this.radius=radius;
	}
	public int get()
	{
		return this.radius;
	}
	public boolean compare(Sortable c1)
	{
		if(this.radius<c1.get())
			return true;
		return false;
	}
	public String toString()
	{
		return " radius-"+this.radius;
	}
}
/*class Employee implements Sortable
{  
	private int empid;
	public Employee(int empid)
	{
		this.empid=empid;
	}
	public boolean compare(Sortable e)
	{
		System.out.println("Hello Employee");
		return false;
	}
}*/

public class SortDemo
{
	
	public static void main(String args[])
	{
		Sortable s[]=new Sortable[3];
		s[0]=new Circle(10);
		s[1]=new Circle(5);
		s[2]=new Circle(19);
	//	s[2]=new Employee(15);
	//s[2]=new Employee(3);
		sortall(s);
	}
	
	public static void sortall(Sortable s[])
	{
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<s.length;j++)
			{
				if(s[i].compare(s[j]))
				{
					Sortable temp=s[i];
					s[i]=s[j];
					s[j]=temp;
					
				}
			}
		}
		
		for(int k=0;k<s.length;k++)
		{
			System.out.println("sorted object"+s[k]);
		}
	}
}