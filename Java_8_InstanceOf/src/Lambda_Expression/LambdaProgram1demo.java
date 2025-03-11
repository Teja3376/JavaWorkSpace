package Lambda_Expression;
interface person1{
	public abstract void eat();
}
public class LambdaProgram1demo {
	public static void main(String[] args) {
		person1 p2 = ()->{
			{
				System.out.println("Hello Science");
			}
		};
		p2.eat();
	}
}
