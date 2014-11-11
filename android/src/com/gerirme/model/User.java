package com.gerirme.model;

/*
 * Essa responsável por armazenar e tratar os dados do usuário da aplicação como utilizamos um framework para persistência ela e um simples POJO.
 */
public class User {
	private long id;
	private String name;
	private String password;
	private String facebookId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFacebookId() {
		return facebookId;
	}

	public void setFacebookId(String facebookId) {
		this.facebookId = facebookId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
