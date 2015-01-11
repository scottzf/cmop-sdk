package com.sobey.sdk.entity;

public class CreateTenantsEntity {

	private String company;
	private String email;
	private String name;
	private String password;
	private String phone;

	public CreateTenantsEntity(String company, String email, String name, String password, String phone) {
		super();
		this.company = company;
		this.email = email;
		this.name = name;
		this.password = password;
		this.phone = phone;
	}

	public String getCompany() {
		return company;
	}

	public String getEmail() {
		return email;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public String getPhone() {
		return phone;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
