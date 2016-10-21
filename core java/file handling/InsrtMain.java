package com;

import java.io.*;  
class InsrtMain {  

	public static void main(String args[])throws Exception{  
		FileInputStream fin=new FileInputStream("abc.txt");  
		FileOutputStream fout=new FileOutputStream("pqr.txt");  
		int i=0;  
		while((i=fin.read())!=-1){  
			fout.write((byte)i);  
		}  
		fin.close(); 
		fout.flush();
		fout.close();
	}  
}  