package com.sri.springcore.SpringCore.assignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String args[]) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sri/springcore/SpringCore/assignment/assigFile.xml");
		ShoppingCart cart = (ShoppingCart) context.getBean("shoppingcart");
		System.out.println(cart);

	}

}
