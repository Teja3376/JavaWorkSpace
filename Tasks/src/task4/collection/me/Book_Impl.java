package task4.collection.me;

import java.util.Arrays;
import java.util.List;

public class Book_Impl {
	public static void main(String[] args) {
		
		List bookMenu = Arrays.asList(new Books(1, " Twisted Truth ", 299),
		new Books (2, " Twisted Lies ", 298),
		new Books (3, " Twisted Game ", 298));
		System.out.println(bookMenu);
		List mydata = Arrays.asList(10,20,30);
		System.out.println(mydata);
	}
}
