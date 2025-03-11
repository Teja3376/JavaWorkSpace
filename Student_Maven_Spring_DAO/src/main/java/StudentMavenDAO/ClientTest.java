package StudentMavenDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientTest {
 public static void main(String[] args) {
	ApplicationContext factory = new ClassPathXmlApplicationContext("applicationcontext.xml");
	StudentInterface s1 = (StudentInterface) factory.getBean("datasource1");
	StudentBean sb = new StudentBean();
	sb.setSno(2);
	sb.setSname("mental");
	sb.setSage(20);
	s1.save(sb);
}
}
