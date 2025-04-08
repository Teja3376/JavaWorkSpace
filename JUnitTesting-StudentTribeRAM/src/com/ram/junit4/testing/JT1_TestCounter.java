package com.ram.junit4.testing;




import static org.junit.Assert.*; 
import org.junit.Test; 


	public class JT1_TestCounter  { 
	JT1_Counter counter1=new JT1_Counter();
		public JT1_TestCounter() { }   // default constructor
				@Test
				public void Increment()
				{
				assertTrue(counter1.increment() == 1);
				assertTrue(counter1.increment() == 2);    
				}
				@Test
				public void Decrement() 
				{
					assertTrue(counter1.decrement() == -1);   
				}
}


