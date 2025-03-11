import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyServlet extends GenericServlet {
	public void service(ServletRequest request, ServletResponse response) throws ServletException {
		System.out.println("Hello World");
	}
}
