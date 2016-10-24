import java.lang.*;
class BannerMain 
{
	public static void main(String args[])
	{
		StringBuilder str = new StringBuilder("Welcome to java");
		System.out.println("string = " + str);
		while(true)
		{
			System.out.print(str);
			char c=str.charAt(0);
			str.substring(1);
			str.deleteCharAt(0);
			str.append(c);
			try {
   
				Thread.sleep(1000);
			} catch (Exception e)
			{
				System.out.println(e);
			}
			
		}
		
   
    
   
   
	}
}