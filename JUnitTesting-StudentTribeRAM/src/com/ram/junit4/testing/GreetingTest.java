package com.ram.junit4.testing;
import org.junit.Test;
 import static org.junit.Assert.*;


public class GreetingTest {
@Test
public void testGreet()
{
	Greeting greeting = new Greeting();
	assertEquals("Unexpected result","WELCOME TO JAVA", greeting.greet());
}
}
