import java.lang.*;
class StringMain
{
	public static void main(String args[])
	{
		String s1="vishal";
		String s3=s1;
		String s2=new String("vishal");
		if(s1==s2)
		{
			System.out.println("String s1 and s2 are ==");
		}
		if(s1==s3)
		{
			System.out.println("String s1 and s3 are ==");
		}
		if(s1.equals(s2))
		{
			System.out.println("String are equal");
		}
		s3=s1+"lalwani";
		if(s1==s3)
		{
			System.out.println("String s1 and s3 are again ==");
		}
	}
}