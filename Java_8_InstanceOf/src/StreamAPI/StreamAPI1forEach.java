package StreamAPI;

import java.util.*;

public class StreamAPI1forEach {
	public static void main(String[] args) {
		List<Integer> listint = Arrays.asList(1,2,3,4,5,6);
		// Normal method by using for loop
		for(int i=0; i<6; i++ ) 
			System.out.println(listint.get(i));
		//Stream API with method reference
		listint.stream().forEach(System.out::println);
	}
}
