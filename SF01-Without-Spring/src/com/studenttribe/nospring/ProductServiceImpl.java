package com.studenttribe.nospring;
public class ProductServiceImpl implements ProductService {
	String product;	
	ProductServiceImpl(){
		
	}
	//Constructor 
	public ProductServiceImpl(String product) {
		
		this.product = product;
	}
     // Setter method
	public void setProduct(String product) {
		this.product = product;
	}

	//normal method
	public void allProducts() {
		System.out.println("Hello  :"+product);
	}

}
