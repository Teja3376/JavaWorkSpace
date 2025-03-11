package Lambda_Expression;

import java.util.*;
public class LambdaProgram7MethodReference {
	public static void main(String[] args) {
		List <String> mygames = new ArrayList();
		mygames.add("Chess");
		mygames.add("UNO");
		mygames.add("Kabaddi");
		//default by using for each adv loop
		for( String name : mygames)
			System.out.println(name);
		System.out.println("1 Default by using for each adv loop");
		// Lambda expression
		mygames.forEach(t->System.out.println(t));
		System.out.println("2 Lambda expression");
		// another type 
		mygames.forEach(System.out::println);
		System.out.println("3 Another type");
	}
}
