package com.sri.springcore.SpringCore.lifecycle.TicketReservation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Reservation {

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@PostConstruct
	public void hi() {
		System.out.println("Inside the hi method");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Inside the bye method");
	}

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", name=" + name + "]";
	}
	
	

}
