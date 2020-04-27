package registrationFormEndeavor;

public class User {

	private String name;
	private String surname;
	private String nickname;
	private String email;
	
	public User() {
	}
	
	public User(String name, String surname, String nickname, String email) {
		this.name = name;
		this.surname = surname;
		this.nickname = nickname;
		this.email = email;
	}
	
	public String readName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String readSurname() {
		return this.surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String readNickname() {
		return this.nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String readEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
