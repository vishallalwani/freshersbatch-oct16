import java.util.*;
class Person implements Comparable<Person>
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
		return height;
	}
	 public int compareTo(Person p)
	 {
        if(this.height > p.getheight())
		{
		return 1;
		}
		else if(this.height < p.getheight())
		{
		return -1;
		}
		else
		{
			return 0;
		}
    }
	public String toString()
	{
		return "height "+this.height+"\tname  "+this.name;
	}
}

public class PersonMain
{
	public static void main(String args[])
	{
	ArrayList<Person>  p=new ArrayList<Person>();
	p.add(new Person("vishal",178,58));
	p.add(new Person("akshay",162,45));
	p.add(new Person("piyush",185,62));
	Collections.sort(p);
	
	for(Person pt:p)
		System.out.println(pt);
	}
}