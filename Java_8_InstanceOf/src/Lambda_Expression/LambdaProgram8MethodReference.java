package Lambda_Expression;

import java.util.Arrays;
import java.util.List;

public class LambdaProgram8MethodReference {
	public static void main(String[] args) {
		List<Integer> mylist= Arrays.asList(1,2,3,4,5,6,7,8,9);
		//Type-1
		System.out.println("Type1 Another type");
		System.out.println(mylist);
		//Type-2
		System.out.println("Type2 Another type");
		for(int numbers : mylist)
			System.out.println(numbers);
		//Type-3
		System.out.println("Type3 Another type");
		mylist.forEach(t->System.out.println(t));
		//Type-4
		System.out.println("Type4 Another type");
		mylist.forEach(System.out::println);
	}
}