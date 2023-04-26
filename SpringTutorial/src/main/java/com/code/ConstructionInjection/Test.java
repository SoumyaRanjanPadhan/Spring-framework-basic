package com.code.ConstructionInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("com/code/ConstructionInjection/config.xml");
		Person person=(Person) context.getBean("person");
		System.out.println(person);
		Addition add=(Addition) context.getBean("add");
		add.doSum();
	}

}
