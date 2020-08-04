package com.sri.springcore.SpringCore.propertyplaceholder.Assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String args[]) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sri/springcore/SpringCore/propertyplaceholder/Assignment/ConfigFile.xml");
		Client client =  (Client) context.getBean("client");
		System.out.println(client);
	}

}
