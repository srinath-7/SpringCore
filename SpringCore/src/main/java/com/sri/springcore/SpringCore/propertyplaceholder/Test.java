package com.sri.springcore.SpringCore.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String args[]) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sri/springcore/SpringCore/propertyplaceholder/ConfigFile.xml");
		MyDao database = (MyDao) context.getBean("mydao");
		System.out.println(database);
	}

}
