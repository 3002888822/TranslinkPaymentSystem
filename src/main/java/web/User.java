package web;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String userid) {
		this.username = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
