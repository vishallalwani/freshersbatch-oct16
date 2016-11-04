package com.vishal;

import static org.junit.Assert.*;

import org.junit.Test;

public class getLengthTest {


	@Test
	public void getLength() {
		StringOperations so=new StringOperations();
		assertEquals(7, so.getLength("xoriant"));
	}
	

	@Test(timeout=2000)
	public void getLength1() {
		StringOperations so=new StringOperations();
		assertEquals(4, so.getLength("pune"));
		while(true)
		{
			
		}
	}
}
