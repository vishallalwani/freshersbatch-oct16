interface Printable{  
void print();  
}  
  
class Circle implements Printable
{  
	public void print()
	{
		System.out.println("Hello Circle");
	}
}
class Employee implements Printable
{  
	public void print()
	{
		System.out.println("Hello Employee");
	}
}

public class PrintDemo
{
	
	public static void main(String args[])
	{
		Printable p[]=new Printable[2];
		p[0]=new Circle();
		p[1]=new Employee();
		printall(p);
	}
	
	public static void printall(Printable p[])
	{
		for(int i=0;i<p.length;i++)
			p[i].print();
	}
}