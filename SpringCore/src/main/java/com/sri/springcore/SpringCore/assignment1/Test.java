package com.sri.springcore.SpringCore.assignment1;

import org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String args[]) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sri/springcore/SpringCore/assignment1/ConfigFile.xml");
		University univ = (University) context.getBean("university");
		System.out.println(univ);
		
		University univ1 = (University) context.getBean("university");
		System.out.println(univ1);
		
		
		
		
		
	}

}
