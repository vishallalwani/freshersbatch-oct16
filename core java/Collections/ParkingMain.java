package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class ParkingMain {

	public static void main(String[] args) {
		
		
		Parked_CarOwner_Details[] p = new Parked_CarOwner_Details[3];
		
		
		  p[0] = new Parked_CarOwner_Details(Parked_CarOwenerList.generateToken() ,"ABC", "swift", "101", 987654321, "pune");
		  p[1] = new Parked_CarOwner_Details(Parked_CarOwenerList.generateToken(),"PQR", "Nano", "102", 135987465, "mumbai");
		  p[2] = new Parked_CarOwner_Details(Parked_CarOwenerList.generateToken() , "ZYZ" , "wagonR" , "103", 987654321, "delhi" );
		
		 Parked_CarOwner_Details.showCarDetails(p);
		Parked_CarOwenerList.add_new_car(p[0]);
		//Parked_CarOwenerList.add_new_car(p2);
		//generateToken();
		
		
		
		int token = Parked_CarOwenerList.generateToken();
		
		
		Parked_CarOwenerList.get_parked_car_location(p[0].token);
		Parked_CarOwenerList.remove_car(p[0].token);
		
	}
	
	

}


class Parked_CarOwner_Details {
	public String ownerName;
	public String carModel;
	public String carNO;
	public long mobileNO;
	public String address;
	public int token;
	public boolean buzy = false;
	
	public Parked_CarOwner_Details(int token, String ownerName, String carModel, String carNO, long mobileNO, String address) {
		this.token = token;
		this.ownerName = ownerName;
		this.carModel = carModel;
		this.carNO = carNO;
		this.mobileNO = mobileNO;
		this.address = address;
	}
	
	public int getToken(){
		return this.token;
	}
	
	static public void showCarDetails(Parked_CarOwner_Details p[]){
		for(int i=0;i<p.length;i++)
		System.out.println("token : "+p[i].token+" OwnerName : "+p[i].ownerName+" carModel : "+p[i].carModel+" MobileNo : "
		+p[i].mobileNO+" Address : "+p[i].address);
	}
	 	
}

class Parked_CarOwenerList{
	static HashMap<Integer,Parked_CarOwner_Details> list = new HashMap<>();
	
	static public int add_new_car(Parked_CarOwner_Details obj){
		 int token = obj.getToken();
		 System.out.println("token : "+token);
		 if(list.containsKey(token)){
			 System.out.println("key already");
		 }
		 else
			 list.put(token,obj);
		 
		return 0;
	}
	
	
	static public int generateToken(){
		int floor,section,comp,token;
		Random ran = new Random();
		floor = ran.nextInt(3);
		section = ran.nextInt(4);
		comp = ran.nextInt(20);
		//System.out.println("f : "+floor +"section : "+section+"comp : "+comp);
		token = (comp*10)+floor;
		token = (token * 10) + section;
		//System.out.println("token "+token);
		return token;
	}
	
	static public void remove_car(int token){
		list.remove(token);
		System.out.println("car removed");
	}
	
	static public void get_parked_car_location(int token){
		int temp = token;
		int floor = token%10;
		token = token/10;
		int section = token%10;
		token = token/10;
		int comp = token;
		System.out.println("car of token "+temp+" parked at : ");
		System.out.println(" floor : "+floor +" section : "+section+" compartment : "+comp);
	}
}