package Nested_class;

import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map.Entry;

class Application
{
	
	static class Cache
	{
		
		static HashMap<Integer,String> hm=new HashMap<Integer,String>(); 
		public static void store(int id,String val)
		{
			hm.put(id, val);
				 
		}
		public static void retrive(int id)
		{
			 for(Entry<Integer, String> m:hm.entrySet()){
				 if(m.getKey()==id)
				   System.out.println(m.getKey()+" "+m.getValue());  
			 }
		}
	}
	
	public void add(int id,String val)
	{
		
		Cache.store(id, val);
		
	}
	public void get(int id)
	{
		
		Cache.retrive(id);
	}
}

class value
{
	public String name;
	public Date d;
	public value(String name,Date d)
	{
		this.name=name;
		this.d=d;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+" "+d;
	}
}
public class ApplicationMain {

	public static void main(String[] args) throws InterruptedException {
		Application a=new Application();
		//Application.Cache c=a.new Cache();
		value v[]=new value[4];
		v[0]= new value("vishal",new Date());
		Thread.sleep(1000);
		v[1]= new value("piyush",new Date());
		Thread.sleep(1000);
		v[2]= new value("akshay",new Date());
		Thread.sleep(1000);
		v[3]= new value("manish",new Date());
		Thread.sleep(1000);
		
		//SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy h:mm:ss a");
		//String formattedDate = sdf.format(date);
		for(int i=0;i<v.length;i++)
		{
			a.add(i,v[i].toString());
			a.get(i);
		}
		
	}
}
