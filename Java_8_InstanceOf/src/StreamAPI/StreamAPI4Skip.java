package StreamAPI;

import java.util.*;

public class StreamAPI4Skip {
	public static void main(String[] args) {
		List<Integer> listint = Arrays.asList(1,2,3,4,5,6);
		// Normal method by using for loop
		for(int i=0; i<6; i++ ) 
			System.out.println(listint.get(i));
		System.out.println("Stream API with method reference");
		//Stream API with method reference
		listint.stream().skip(4).forEach(System.out::println);
	}
}
