package Lambda_Expression;
interface person4{
	public abstract void eat(String food , int ml);
}
public class LambdaProgram4demo {
	public static void main(String[] args) {
		person4 p4 = (food, ml)->{
			
			System.out.println(food+ " is Rich on White");
			System.out.println("Take "+ml+" ml daily");
		};
		p4.eat("Milk",100);
	}
}
