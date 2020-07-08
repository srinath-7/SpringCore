package com.sri.springcore.SpringCore.reftypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/sri/springcore/SpringCore/reftypes/RefFile.xml");
		 Student student = (Student) context.getBean("student");
		 System.out.println(student);
	}

}
