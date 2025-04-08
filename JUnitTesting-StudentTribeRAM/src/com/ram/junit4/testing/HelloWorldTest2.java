package com.ram.junit4.testing;

import junit.framework.TestCase;


public class HelloWorldTest2 extends TestCase { 
    public HelloWorldTest2( String name) 
       { super(name); } 
    public void testSay() 
       {   HelloWorld hi = new HelloWorld(); 
           assertEquals("Hello World!", hi.say());
           
           }
    
     } 

