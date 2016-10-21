import java.lang.*;
class StringBufferMain
{
	public static void main(String args[])
	{
		String s1="vishal";
		String s3=s1;
		if(s1==s3)
		{
			System.out.println("references for String s1 and s3 are same");
		}
		s3=s1+"lalwani";
		if(s1==s3)
		{
			System.out.println("references for String s1 and s3 are same after change");
		}
		
		
		StringBuffer sb1=new StringBuffer("Hello ");   
		System.out.println(sb1);
		StringBuffer sb2=sb1;
		if(sb1==sb2)
		{
			System.out.println("String sb1 and sb2 are ==");
		}
		sb2.append("Java");
		if(sb1==sb2)
		{
			System.out.println("String s1 and s3 are == again");
		}
		
	
		}		
		}
