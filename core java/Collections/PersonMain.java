package Collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Person {
	private int weight;
	private int height;
	private String name;
	
	public Person(int weight,int height,String name) {
		// TODO Auto-generated constructor stub
		this.weight=weight;
		this.height=height;
		this.name=name;
	}
	
	public int getweight()
	{
		return weight;
	}
	
	public int getheight()
	{
		return height;
	}

	public String toString(){
        return "Name: "+this.name+"  weight: "+this.weight+"  height:"+this.height;
    }

	
	
	
	
}


class weightComp implements Comparator<Person>{
	 
    @Override
    public int compare(Person p1, Person p2) {
    	 if(p1.getweight() == p2.getweight()){
            heightComp h= new heightComp();
           return h.compare(p1, p2);
    	 }
    	if(p1.getweight() > p2.getweight()){
            return 1;
        } else {
            return -1;
        }
    }

	
}
class heightComp implements Comparator<Person>{
	 
    @Override
    public int compare(Person p1, Person p2) {
        if(p1.getheight() > p2.getheight()){
            return 1;
        } else {
            return -1;
        }
    }

	
}


public class PersonMain {

	public static void main(String[] args) {
		
//		Person p1=new Person(55,165,"vishal");
//		Person p2=new Person(65,178,"piyush");
//		Person p3=new Person(55,169,"tim");
		
		Set<Person> set=new TreeSet<Person>(new weightComp());
		set.add(new Person(55,165,"vishal"));
		set.add(new Person(65,178,"piyush"));
		set.add(new Person(55,169,"tim"));
		
		Iterator<Person> itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
        
	}
}
