package com.sri.springcore.SpringCore.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String args[]) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sri/springcore/SpringCore/properties/PropertiesFile.xml");
		CountriesAndLanguages lang = (CountriesAndLanguages) context.getBean("countriesAndLangs");
		System.out.println(lang);
	}

}
