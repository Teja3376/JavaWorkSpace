package com.ram.junit4.testing;

import static org.junit.Assert.*; 

import org.junit.Test;


public class HelloWorlTest {
	
	@Test
	public void testSay()
	{
		HelloWorld hello=new HelloWorld();
		
		assertEquals("Unexpected Result","HelloWorld!", hello.say());
	}
}
