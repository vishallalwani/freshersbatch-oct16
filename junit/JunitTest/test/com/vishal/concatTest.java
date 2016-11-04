package com.vishal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class concatTest {

	
	@Before
	public void before() {
	System.out.println("Before Test");
	
	}
	
	@After
	public void after() {
	System.out.println("After Test");
	
	}
	
	
	@Test
	public void testconcat() {
		StringOperations so=new StringOperations();
		assertEquals("helloworld", so.concat("hello", "world"));
	}

	@Test
	public void testconcat1() {
		StringOperations so=new StringOperations();
		assertEquals("xoriantpune", so.concat("xoriant", "pune"));
	}

}
