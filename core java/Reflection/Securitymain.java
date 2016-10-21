package ref;
import java.lang.reflect.Method;
import java.lang.reflect.ReflectPermission;
 class A {  
	  private void message(){System.out.println("hello java"); }  
	}  

 
 public class Securitymain
{
 
	public static void main(String[] args)throws Exception
	{  
  
    Class c = A.class; 
    Object o= c.newInstance();  
    Method m =c.getDeclaredMethod("message", null); 
    m.setAccessible(true);  
    m.invoke(o, null);  
	}

	
}  