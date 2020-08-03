package com.sri.springcore.SpringCore.ConstructorInjection.Ambugity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String args[]) {
		 
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sri/springcore/SpringCore/ConstructorInjection/Ambugity/ConfigFile.xml");
		Addition addition = (Addition) context.getBean("addition");
		System.out.println(addition);
	}

}
