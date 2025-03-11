package com.studenttribe.corejava.layers.controller;

import java.util.Scanner;

import com.studenttribe.corejava.layers.servicelayer.BookService;

public class BookController {

	public static void main(String[] args) throws ClassNotFoundException {
		try {
		int bookId=100;
		String title="java";
		double price=250;
		
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter BookID");
		
		BookService bookService=new BookService();
		                        // 100   java  250
		int t=bookService.addBook(bookId,title,price);
		
		System.out.println("BookController return value for db  :"+t);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
