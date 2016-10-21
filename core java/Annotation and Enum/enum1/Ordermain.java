package enum1;
import java.lang.*;

 enum Status 
 {
	 NEW(1),REJECTED(2) , ACCEPTED(3), COMPLETED(4) ;
	 int value;  
	 private Status(int value)
	 {  
		 this.value=value; 
	 }
	
	
 }
class Order
{

	private int id;
	String name;
	private int quant;
	private int price;
	Status st;
	public Order(int id, String name, int quant, int price, Status s) {
	this.id=id;
	this.name=name;
	this.quant=quant;
	this.price=price;
	this.st=s;
	}

	public String toString()
	{
		return "Order id:"+this.id+"\tname:"+this.name+"\tquantity:"+this.quant+"\tprice:"+this.price+"\tStatus:"+this.st;
	}
}

public class Ordermain {
	
	public static void main(String[] args) {
		Order [] o=new Order[2];
		 o[0]=new Order(1,"bike",1,5000,Status.NEW);
		 o[1]=new Order(2,"car",1,20000,Status.COMPLETED);
		 for(int i=0;i<o.length;i++)
		 {
			 System.out.println(o[i].toString());
		 }
	}  
	
}
