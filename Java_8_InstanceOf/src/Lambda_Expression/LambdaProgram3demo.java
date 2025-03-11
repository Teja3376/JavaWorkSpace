package Lambda_Expression;
interface person3{
	public abstract void eat(String food);
}
public class LambdaProgram3demo {
	public static void main(String[] args) {
		person3 p3 = (food)->System.out.println(food+ " is Rich drink");
		p3.eat("Milk");
	}
}
