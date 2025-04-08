package com.ram.java.junittesting;


	
import static org.junit.Assert.assertEquals;
import org.junit.Test;
	public class CalculationTest
	
	  {	
		Calculation cal=new Calculation();
		@Test 
		public void testAdd() 
        	{  
		    try {
		   //assertEquals(20, new Calculation().addition(10,10));
		   
		    assertEquals(20,cal.addition(10,10));
		   assertEquals(5,cal.substraction(10,5));
		    
		   assertEquals(9,cal.multiplication(3, 3));
		   } catch (Exception e) {
			System.out.println(e);
		 } 
		
		  
	} 
	
		
	}
