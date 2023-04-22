package hieu.dev.data.model;

public class User {
	private int id;
	private String user;
	private String password;
	private String role;
	
	public User(String user, String password, String role) {
		super();
		this.user = user;
		this.password = password;
		this.role = role;
	}
	public User(int id, String user, String password, String role) {
		super();
		this.id = id;
		this.user = user;
		this.password = password;
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
