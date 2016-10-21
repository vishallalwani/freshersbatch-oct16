import java.util.*;
class armstrong_6{  
  public static void main(String[] args)  {  
    int total=0,a,temp,num;  
    System.out.println("enter the number");
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();  
    temp=num;  
    while(num>0)  
    {  
    a=num%10;  
    num=num/10;  
    total=total+(a*a*a);  
    }  
    if(temp==total)  
    System.out.println("armstrong number");   
    else  
        System.out.println("Not armstrong number");   
   }  
} 