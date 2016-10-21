package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

	
public class SequenceMain {

	public static void main(String[] args) {
		
			FileInputStream fin[]=new FileInputStream[2];
		try {
			FileInputStream fin1 = new FileInputStream("abc.txt");
			FileInputStream fin2=new FileInputStream("pqr.txt");
			FileInputStream fin3=new FileInputStream("xyz.txt");
			
			Vector v=new Vector();
			v.add(fin1);
			v.add(fin2);
			v.add(fin3);
			
			Enumeration e=v.elements(); 
			SequenceInputStream sis=new SequenceInputStream(e);
			int i;
			while((i=sis.read())!=-1){
				System.out.print((char)i);
			}
			sis.close();
			fin1.close();
			fin2.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
