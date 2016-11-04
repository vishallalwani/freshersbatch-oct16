package com.vishal;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class getCharacterTest {

	
	@BeforeClass
	public static void before() {
	System.out.println("Before Test");
	
	}
	@AfterClass
	public static void after() {
	System.out.println("After Test");
	}
	
	
	
	@Test
	public void getCharacter() {
		StringOperations so=new StringOperations();
		assertEquals('a', so.getCharacter("xoriant",4));
	}
	

	@Test
	public void getCharacter1() {
		StringOperations so=new StringOperations();
		assertEquals('o', so.getCharacter("xoriant",1));
	}
}
