package com.sri.springcore.SpringCore.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String args[]) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sri/springcore/SpringCore/list/ListConfigfile.xml");
		Hospital hospital = (Hospital) context.getBean("hospital");
		System.out.println("Hospital name:" + hospital.getName());
		System.out.println("Hospital department:" + hospital.getDepartment());
		System.out.println("Hospital department:" + hospital.getDepartment().getClass());
	}

}
