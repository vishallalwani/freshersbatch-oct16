package com;

import java.io.*;

public class SerializeMain {

	private void serialization1()
	{
		File file = new File("abc.txt");
		ObjectOutputStream out;
		try {
			FileOutputStream fout = new FileOutputStream(file);
			out = new ObjectOutputStream(fout);
			out.writeObject(new Account(1, "vishal", new Date(21,10,2016)));
			out.flush();
			out.close();
			System.out.println("Serialisation done");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void deserialization1()
	{
		try {
			File file = new File("abc.txt");
			FileInputStream fin = new FileInputStream(file);
			ObjectInputStream in = new ObjectInputStream(fin);
			Account ac = (Account)in.readObject();
			System.out.println("Deserialisation done");
			System.out.println("order = " + ac);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void main(String[] args) {
		SerializeMain sm=new SerializeMain();
		//sm.serialization1();
		sm.deserialization1();
	}
}
