package com;

import java.io.File;
import java.util.Date;

public class FileDetail {

	public static void main(String[] args) {


		File file = new File("C:/Users/lalwani_v/workspace/File Handling/abc.txt");

		System.out.println("name: " + file.getName());
		System.out.println("size: " + file.length());
		System.out.println("last modified: " + new Date(file.lastModified()));
		System.out.println("path: " + file.getAbsolutePath());
		
		 if (file.canWrite())
		        System.out.println("CAN WRITE");
		    else
		        System.out.println("CANNOT WRITE");
		    if (file.canRead())
		        System.out.println("CAN READ");
		    else
		        System.out.println("CANNOT READ");

		    if (file.canExecute())
		        System.out.println("CAN EXECUTE");
		    else
		        System.out.println("CANNOT EXECUTE");
		
	}
}

