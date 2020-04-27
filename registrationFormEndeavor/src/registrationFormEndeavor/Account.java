package registrationFormEndeavor;

public class Account {
	
	private String username;
	private String password;
	
	public Account() {
	}
	
	public Account(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String readUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String readPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}