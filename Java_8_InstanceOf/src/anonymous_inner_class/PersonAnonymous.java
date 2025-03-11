package anonymous_inner_class;
interface person{
	abstract public  void eat();
}
public class PersonAnonymous {
	public static void main(String[] args) {
		person p1 = new person() {
			public void eat() 
			{
				System.out.println("Each rich food");
			}
		};
		p1.eat();
	}
}
