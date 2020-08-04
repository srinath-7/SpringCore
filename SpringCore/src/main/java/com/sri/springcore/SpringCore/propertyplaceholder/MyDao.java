package com.sri.springcore.SpringCore.propertyplaceholder;

public class MyDao {
	
	private String dbServer;
	private int dbPort;
	
	MyDao(String dbServer, int dbPort) {
		this.dbServer = dbServer;
		this.dbPort = dbPort;
	}

	@Override
	public String toString() {
		return "MyDao [dbServer=" + dbServer + ", dbPort=" + dbPort + "]";
	}

	
	
	
	

}
