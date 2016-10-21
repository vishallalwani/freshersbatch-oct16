import java.util.*;
class Person 
{
	private String name;
	private int height;
	private int weight;
	public Person(String name,int height,int weight)
	{
		this.name=name;
		this.height=height;
		this.weight=weight;
	}
	public int getheight()
	{
		return this.height;
	}
	public int getweight()
	{
		return this.weight;
	}
}	
class comparebyheight implements Comparator<Person>
{
	
	public int compare(Person p1,Person p2)
	 {
        if(p1.getheight() > p2.getheight())
		{
		return 1;
		}
		else if(p1.getheight() < p2.getheight())
		{
		return -1;
		}
		else
		{
			return 0;
		}
    }

}
class comparebyweight implements Comparator<Person>
{
	
	public int compare(Person p1,Person p2)
	 {
        if(p1.getweight() > p2.getweight())
		{
		return 1;
		}
		else if(p1.getweight() < p2.getweight())
		{
		return -1;
		}
		else
		{
			return 0;
		}
    }

}
public class ComparatorMain
{
	public static void main(String args[])
	{
	ArrayList<Person>  p=new ArrayList<Person>();
	p.add(new Person("vishal",178,58));
	p.add(new Person("akshay",162,45));
	p.add(new Person("piyush",185,62));
	Collections.sort(p,new comparebyweight());
	
	for(Person pt:p)
		System.out.println(pt.getweight());
	}
}