package com.sri.springcore.SpringCore.lifecycle.xmlConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sri/springcore/SpringCore/lifecycle/xmlConfig/PatientFile.xml");
		Patient patient = (Patient) context.getBean("patient");
		System.out.println(patient);
		
	}
	

}
