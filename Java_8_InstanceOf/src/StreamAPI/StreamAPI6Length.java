package StreamAPI;

import java.util.*;

public class StreamAPI6Length {
	public static void main(String[] args) {
		List<String> listint = Arrays.asList("Hello","mr","Charan","Teja","ji");
		// Normal method by using for loop
		for(int i=0; i<4; i++ ) 
			System.out.println(listint.get(i));
		System.out.println("Stream API with method reference");
		//Stream API with method reference
		listint.stream().map(str -> str.length()).forEach(System.out::println);
		
	}
}
