package Lambda_Expression;

import java.util.*;
public class LambdaProgram6ForEach {
	public static void main(String[] args) {
		List <String> mygames = new ArrayList();
		mygames.add("Chess");
		mygames.add("UNO");
		mygames.add("Kabaddi");
		//default by using for each adv loop
		for( String name : mygames)
			System.out.println(name);
		// Lambda expression
		mygames.forEach(t->System.out.println(t));
		
	}
}
