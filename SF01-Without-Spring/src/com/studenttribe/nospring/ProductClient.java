package com.studenttribe.nospring;

public class ProductClient {

	public static void main(String[] args) {
		 
		ProductServiceImpl p1=new ProductServiceImpl("MacAirM12021");
		p1.allProducts();
		
		ProductServiceImpl p2=new ProductServiceImpl();
		p2.setProduct("MacProM12021");
		p2.allProducts();
	}
}
