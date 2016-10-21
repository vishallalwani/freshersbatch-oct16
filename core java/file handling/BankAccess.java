package com;

import java.io.File;
import java.io.RandomAccessFile;

public class BankAccess{
	int id;
	transient String name;
	double balance; 
	//private static final long serialVersionUID = 5l;

//	public BankAccess(int id,String name,double balance) {
//		// TODO Auto-generated constructor stub
//		this.id=id;
//		this.name=name;
//		this.balance=balance;
//	}

	public void add(int id,String name,double balance)
	{	try {

		this.id=id;
		this.name=name;
		this.balance=balance;
		File file = new File("abc.txt");
		RandomAccessFile raf = new RandomAccessFile(file, "ra"); //rw means read & write both modes
		raf.writeInt(this.id);
		raf.writeUTF(this.name);
		raf.writeDouble(this.balance);
	} catch (Exception e) {
		// TODO: handle exception
	}
	}
	
	
	public void update()
	{	try {
		

		File file = new File("abc.txt");
		RandomAccessFile raf = new RandomAccessFile(file, "ra"); //rw means read & write both modes
		//long currentintPosition = raf.getFilePointer(); 
		//raf.seek(0);
		raf.writeInt(this.id);
		raf.writeUTF(this.name);
		raf.writeDouble(this.balance);
	} catch (Exception e) {
		// TODO: handle exception
	}
	}
	
	
	
	public void read()
	{
		
		try {
			File file = new File("abc.txt");
			RandomAccessFile raf = new RandomAccessFile(file, "rw"); //rw means read & write both modes

		//	long currentPosition = raf.getFilePointer(); 
		//	raf.seek(0); 
			int id=raf.readInt();
			String name = raf.readUTF();
			double balance = raf.readDouble();
			System.out.println("Account Details: "+ id +"\t"+name+"\t"+balance);
			 id=raf.readInt();
			 name = raf.readUTF();
			 balance = raf.readDouble();
			System.out.println("Account Details: "+ id +"\t"+name+"\t"+balance);
			raf.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Account Details: "+this.id+"\t"+this.name+"\t"+this.balance;
	}
}
