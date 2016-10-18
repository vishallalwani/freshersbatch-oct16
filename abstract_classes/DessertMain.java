import java.util.*;
abstract class DessertItem
{
		public int cost;
	public int tax;
	public static int quantity;
	abstract void getcost();
}

class Candy extends DessertItem
{
	public static int quantity=5;
	ArrayList cd = new ArrayList();
	public int cost;
	public int tax;
	public void getcost()
	{
		int total=cost+tax;
		System.out.println("cost for candy is:!!!"+total);
		
	}
}

class Cookie extends DessertItem
{
	public static int quantity=5;
	public void getcost()
	{
		System.out.println("");
	}
}

class IceCream extends DessertItem
{
	public static int quantity=5;
	public void getcost()
	{
		System.out.println("");
	}
}



public class DessertMain
{
	public static void main(String[] args)
	{	
		int choice=0;
		DessertItem d[]=new DessertItem[3];
		d[0]=new Candy();
		d[1]=new Cookie();
		d[2]=new IceCream();
		System.out.println("welcome!! Click 1 for owner and 2 for Customer");
		Scanner sc=new Scanner(System.in);
		int chc=sc.nextInt();
		switch(chc)
		{
			case 1:while(choice!=4)
					{
						System.out.println(" Enter the coice of Dessert you want to add:"+"\n1:Candy"+"\n2:Cookie"+"\n3:IceCream"+"\n4:exit");
						choice=sc.nextInt();
						switch(choice)
						{
							case 1: System.out.println(" Enter the quantity of candy you want to add");
									int quantity=sc.nextInt();
									Candy.quantity=Candy.quantity+quantity;
									System.out.println(" Enter the price for candy");
									int price=sc.nextInt();
									d[0].cost=price;
									System.out.println(" Enter the tax for the candy");
									int tax=sc.nextInt();
									d[0].tax=tax;
									
									break;
							case 2: if(d[1].quantity>0)
									{
										d[1].getcost();
									}
									
									break;
							case 3: if(d[2].quantity>0)
									{
										d[2].getcost();
									}
									
									break;
							case 4: break;
							default:System.out.println("Enter correct option");
						}
					}
					break;
			case 2:	while(choice!=4)
					{
						System.out.println("welcome!!! Enter the coice of Dessert:"+"\n1:Candy"+"\n2:Cookie"+"\n3:IceCream"+"\n4:exit");
						choice=sc.nextInt();
						switch(choice)
						{
							case 1: if(Candy.quantity>0)
									{
										d[0].getcost();
									}
									else
										System.out.println("candy not available!!");
									break;
							case 2: if(d[1].quantity>0)
									{
										d[1].getcost();
									}
									else
										System.out.println("cookie not available!!");
									break;
							case 3: if(d[2].quantity>0)
									{
										d[2].getcost();
									}
									else
										System.out.println("Icecream not available!!");
									break;
							case 4: break;
							default:System.out.println("Enter correct option");
						}
					}
					break;
		}
	}
}