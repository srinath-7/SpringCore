package com.sri.springcore.SpringCore.propertyplaceholder.Assignment;

public class Client {
	
	private String Url;
	private String UserName;
	private String Password;
	
	
	public Client(String url, String userName, String password) {
		this.Url = url;
		this.UserName = userName;
		this.Password = password;
	}

	public String getUrl() {
		return Url;
	}

	public void setUrl(String url) {
		Url = url;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	@Override
	public String toString() {
		return "Client [Url=" + Url + ", UserName=" + UserName + ", Password=" + Password + "]";
	}
	
	

}
