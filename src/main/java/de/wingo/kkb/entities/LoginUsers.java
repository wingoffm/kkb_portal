package de.wingo.kkb.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Login_USER")
public class LoginUsers {

	@Id
	@GeneratedValue
	@Column(name = "Id", nullable = false)
	private Long id;

	@Column(name = "USER_Name", length = 64, nullable = false)
	private String userName;

	@Column(name = "PASSWORD", length = 64, nullable = false)
	private String password;

	public LoginUsers(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public LoginUsers() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
