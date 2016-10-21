public class Date
{
	private int day,month,year;
	
	public Date()
	{
		this.day=17;
		this.month=10;
		this.year=2016;
	}
	
	public Date(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	void getter()
	{
		System.out.println("the date is::"+this.day+"/"+this.month+"/"+this.year);
	}
	public static void swap_date(Date array[])
	{
			Date temp=new Date();
			System.out.println("array length:"+array.length);
			temp=array[0];
			array[0]=array[1];
			array[1]=temp;
			
		
	}
	
	public static void main(String args[])
	{
		Date date1=new Date();
		Date date2=new Date(19,03,2016);
		date1.getter();
		date2.getter();
		Date arr[]=new Date[2];
		arr[0]=date1;
		arr[1]=date2;
		Date.swap_date(arr);
		System.out.println("After swaping");
		date1.getter();
		date2.getter();
	}
}