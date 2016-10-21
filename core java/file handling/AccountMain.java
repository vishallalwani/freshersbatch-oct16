package com;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;

public class AccountMain {
	private int acnt_no;
	private double salary;
	private String name;
	File file=new File("abc.txt");
		public AccountMain(int acnt_no,double salary,String name) {
			this.acnt_no=acnt_no;
			this.salary=salary;
			this.name=name;
		}
	void accountwrite()
	{
		
		try {
			FileOutputStream fos=new FileOutputStream(file);
			DataOutputStream dos=new DataOutputStream(fos);
			dos.writeInt(this.acnt_no);
			dos.writeDouble(this.salary);
			dos.writeUTF(this.name);
			dos.flush();
			fos.flush();
			dos.close();
			fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void accountread()
	{
		
		FileInputStream fis;
		try {
			fis = new FileInputStream(file);
			DataInputStream dis = new DataInputStream(fis);
			int acnt_no = dis.readInt();
			double salary = dis.readDouble();
			String name = dis.readUTF();
			dis.close();
			fis.close();
			System.out.println("Account number:"+acnt_no+" Salary: "+salary+" Name: "+name);
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		AccountMain am[]=new AccountMain[3];
		
		am[0]=new AccountMain(1, 2789, "vishal");	
		am[1]=new AccountMain(2, 60000, "john");	
		am[2]=new AccountMain(3, 5500, "anand");	
		
		
		for (int i = 0; i < am.length; i++) {
			am[i].accountwrite();
			am[i].accountread();
		}
		
	}
}
