package studentPackage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class StudentClientTest {
	 public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("applicationcontext.xml");
		StudentInterface s1 = (StudentInterface) factory.getBean("datasource1");
		StudentBean s = new StudentBean();
		s.setSno(1);
		s.setSname("mental");
		s.setSage(20);
		s1.save(s);
	}
}
