package ref;

class Simple{  
	 void message(){System.out.println("Hello Java");}  
	}  
	  
	class InstantiateMain{  
	 public static void main(String args[]){  
	  try
	  {  
		  Class c=Class.forName("Simple");  
		  Simple s=(Simple)c.newInstance();  
		  s.message();  
		  
	  }catch(Exception e)
	  {
		  System.out.println(e);
	  }  
	  
	 }  
	}  