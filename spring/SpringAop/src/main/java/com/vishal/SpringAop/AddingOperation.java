package com.vishal.SpringAop;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class AddingOperation {

	public void addInList() {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		for (int i = 0; i < 1000; i++) {
			list.add(i);
		}
	}

	public void addInVector() {
		// TODO Auto-generated method stub
		Vector<Integer> vector=new Vector<Integer>();
		for (int i = 0; i < 1000; i++) {
			vector.add(i);
		}
	}
}
