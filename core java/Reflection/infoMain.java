package ref;
import java.lang.reflect.*;

class Information
{
	int id;
	public Information() {
		// TODO Auto-generated constructor stub
	}
	public void infomethod()
	{}
}


public class infoMain {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException {
		Class cls=Class.forName(args[0]);  	
		//System.out.println(c.getName());
		
		// Class cls =  args[0].class;
	  
	      Constructor[] ct = cls.getDeclaredConstructors();
	      for(int i = 0; i < ct.length; i++)
	      {
	         System.out.println("Constructor found: " + ct[i].toString());
	     
	      }
	      System.out.println();
	      Field[] f=cls.getDeclaredFields();
	      for(int i = 0; i < f.length; i++)
	      {
	         System.out.println("field found: " + f[i].toString());
	     
	      }
	      
	      System.out.println();
	      Method[] m=cls.getDeclaredMethods();
	      for(int i = 0; i < m.length; i++)
	      {
	         System.out.println("method found: " + m[i].toString());
	     
	      }
	}
}
