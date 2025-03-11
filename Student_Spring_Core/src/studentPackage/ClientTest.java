package studentPackage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class ClientTest{
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("applicationcontent.xml");
		StudentInterface s1 = (StudentInterface) factory.getBean("studentservice1");
		s1.data();
		
	}

		
}
