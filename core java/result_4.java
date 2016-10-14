import java.util.*;
public class result_4{
      public static void main(String[] args)
	 {
            System.out.println("enter mark for 1st subject");
		Scanner sc=new Scanner(System.in);
		int sub1=sc.nextInt();
		System.out.println("enter mark for 2nd subject");
		int sub2=sc.nextInt();
            	System.out.println("enter mark for 3rd subject");
		int sub3=sc.nextInt();
            	if(sub1>60 && sub2>60 && sub3>60)
		{
		System.out.println("Passed!!");
		}
			else if(sub1>60 && sub2>60 ||sub2>60 && sub3>60 ||sub1>60 && sub3>60  )
			{
			System.out.println("promoted!!");
			}
		else
		System.out.println("failed!!");

	}
}	