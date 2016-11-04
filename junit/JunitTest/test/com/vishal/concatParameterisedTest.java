package com.vishal;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class concatParameterisedTest {

	@Parameter(value=0)
	public static String str1;
	@Parameter(value=1)
	public static String str2;

	 @Parameters
	 public static Collection<Object[]> data() {
	        return Arrays.asList(new Object[][] {     
	                 { "hello", "world" }, { "xoriant", "pune" }, { "junit", "testing" } });
	    }
	 
	@Test
	public void testconcat() {
		StringOperations so=new StringOperations();
		assertEquals(str1.concat(str2), so.concat(str1, str2));
	}

	

}
