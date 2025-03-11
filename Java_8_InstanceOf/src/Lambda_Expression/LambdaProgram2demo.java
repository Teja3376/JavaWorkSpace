package Lambda_Expression;
interface person2{
	public abstract void eat();
}
public class LambdaProgram2demo {
	public static void main(String[] args) {
		person2 p2 = ()->System.out.println("Hello Science");
		p2.eat();
	}
}
