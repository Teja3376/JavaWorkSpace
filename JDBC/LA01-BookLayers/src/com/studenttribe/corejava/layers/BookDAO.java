package com.studenttribe.corejava.layers;

import java.util.ArrayList;
 
public class BookDAO {
	//                     100 , java, 250,c
	public int addBook(BookBean bookBean) {
		
		
		ArrayList bookList=new ArrayList();
		
		
		bookList.add(bookBean.getBookId());
		bookList.add(bookBean.getTitle());
		bookList.add(bookBean.getPrice());
		// Printing with Bean
		System.out.println("Book DAO Layer");
		System.out.println("BookID :"+bookBean.getBookId());
		System.out.println("BookTitle:"+bookBean.getTitle());
		System.out.println("Book Price :"+bookBean.getPrice());
		//Array List printing
		System.out.println("bookList.."+bookList);
		System.out.println(bookList);
		
		return 1;  
	}

}