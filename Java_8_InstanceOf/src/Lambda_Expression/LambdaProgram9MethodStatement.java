package Lambda_Expression;
interface names{
	public String myname(String name);
}
public class LambdaProgram9MethodStatement {
	public static void main(String[] args) {
		names n1 = (name)->{
			String str1 = "CoreJava";
			String str2 = name + str1;
			return str2;
		};
		System.out.println(n1.myname("Hello! "));
	}
}