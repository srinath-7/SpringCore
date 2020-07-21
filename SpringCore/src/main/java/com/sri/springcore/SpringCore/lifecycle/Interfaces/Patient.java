package com.sri.springcore.SpringCore.lifecycle.Interfaces;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean{

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside the setter method");
		this.id = id;
	}
   
	
	public void hi() {
		System.out.println("Inside hi method");
	}

	
	public void bye() {
		System.out.println("Bye method");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside the set method");
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside the destroy method");
	
		
	}

	

	
}
