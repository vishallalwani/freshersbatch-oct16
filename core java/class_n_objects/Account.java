public class Account
{
	private int money=0;
	
	public void deposit(int money)
	{
		this.money=this.money+money;
		System.out.println("deposited");
	}
	
	public void withdraw(int money)
	{
		this.money=this.money-money;
		System.out.println("withdrawed");
	}
	
	public void print()
	{
		System.out.println("The money available in the account:"+this.money);
	}
	public static void main(String[] args)
	{
		Account ac=new Account();
		ac.print();
		ac.deposit(950);
		ac.print();
		ac.withdraw(500);
		ac.print();
	}
}