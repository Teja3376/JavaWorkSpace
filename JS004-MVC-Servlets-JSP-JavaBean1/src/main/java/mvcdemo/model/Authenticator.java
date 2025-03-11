package mvcdemo.model;

public class Authenticator {
	public Authenticator() {
		super();
	}
	public String result(userBean userBean) {
		if("teja".equalsIgnoreCase(userBean.getUsername()) && "charan".equalsIgnoreCase(userBean.getPassword())) {
			String sucess = "sucess";
			return sucess;
			
		}
		else {
			String error = "error";
			return error;
		}
		
	}
}
