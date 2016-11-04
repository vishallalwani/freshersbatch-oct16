package com.vishal;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class getCharacterParameterisedTest {

	@Parameter(value=1)
	public static int num;

	@Parameter(value=0)
	public static String str;

	@Parameters
	public static Collection<Object[]> data() {
		  return Arrays.asList(new Object[][] {     
              { "hello", 2 }, { "xoriant", 3 }, { "junit", 1 } });
 }




	@Test
	public void getCharacter() {
		StringOperations so=new StringOperations();
		assertEquals(str.charAt(num), so.getCharacter(str,num));
	}



}
