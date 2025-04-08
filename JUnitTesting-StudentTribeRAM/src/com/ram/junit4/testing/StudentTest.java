package com.ram.junit4.testing;

import static org.junit.Assert.*; 
import org.junit.Test;
import org.junit.*;


public class StudentTest
{
	@Test
	public void GetRollNo()
	{
		Student s = new Student(100, "Ravi", "Kumar");
		assertEquals(s.getRollNo(), 100);
	}
	@Test
	public void GetFirstName()
	{
		Student s = new Student(100, "Ravi", "Kumar");
		assertEquals(s.getFirstName(), "Ravi");
	}
	@Ignore("The method is being modified")
	@Test
	public void testGetLastName()
	{
		Student s = new Student(100, "Ravi", "Kumar");
		assertEquals(s.getLastName(), "Kumar");
	}
}