package mvcdemo.model;

public class userBean {
	public userBean(){
		super();
	}
	private String username ;
	private String password ;
	public userBean(String username, String password) {
		username = this.username;
		password = this.password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
