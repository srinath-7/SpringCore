package com.sri.springcore.SpringCore.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sri.springcore.SpringCore.set.CarDealer;

public class Test {
	
	public static void main(String args[]) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/sri/springcore/SpringCore/Map/MapConfigFile.xml");
		Customer customer = (Customer) context.getBean("customer");
//		System.out.println("CarDealer name:" + customer.getId());
//		System.out.println("CarDealer models:" + customer.getProducts());
		System.out.println(customer);
	}

}
