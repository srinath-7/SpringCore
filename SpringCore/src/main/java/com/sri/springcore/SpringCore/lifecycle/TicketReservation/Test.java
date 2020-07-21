package com.sri.springcore.SpringCore.lifecycle.TicketReservation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String args[]) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/sri/springcore/SpringCore/lifecycle/TicketReservation/ResFile.xml");
		Reservation res = (Reservation) context.getBean("reservation");
		System.out.println(res);
		context.registerShutdownHook();
		
	}

}
