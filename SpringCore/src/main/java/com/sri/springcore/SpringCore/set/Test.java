package com.sri.springcore.SpringCore.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sri.springcore.SpringCore.list.Hospital;

public class Test {
	
	public static void main(String args[]) {
		ClassPathXmlApplicationContext dealer = new ClassPathXmlApplicationContext("com/sri/springcore/SpringCore/set/SetConfigFile.xml");
		CarDealer cardealer = (CarDealer) dealer.getBean("CarDealer");
		System.out.println("CarDealer name:" + cardealer.getName());
		System.out.println("CarDealer models:" + cardealer.getModels());
		

	}

}
