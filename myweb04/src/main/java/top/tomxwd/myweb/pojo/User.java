package top.tomxwd.myweb.pojo;

public class User {
	
	private String username;
	private String password;
	private String email;
	private String phone;
	public User() {
		super();
	}
	public User(String username, String password, String email, String phone) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", email=" + email + ", phone=" + phone + "]";
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void testGit() {
		System.out.println("git");
	}
	
	public void testGit2() {
		System.out.println("git2");
	}	
	
	public void testGit3() {
		int a = 1;
		System.out.println("git3,分支下写新方法");
	}
	
}
