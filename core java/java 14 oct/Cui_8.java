import java.util.*;
public class Cui_8
{
    public static void main(String[] args) 
     {
        int count=0;
	String name="vishal",pass="lalwani"; 
	while(count<3)
	{
        System.out.print("enter the name");
        Scanner sc=new Scanner(System.in);
	String name1=sc.next();
	System.out.print("enter the password");
        String pass1=sc.next();
	if(name.equals(name1) && pass.equals(pass1))
	{
	System.out.print("welcome "+name);
	break;
	}
	else
	count++;
	}
	if(count==2)
	System.out.print("contact admin");
    }
}