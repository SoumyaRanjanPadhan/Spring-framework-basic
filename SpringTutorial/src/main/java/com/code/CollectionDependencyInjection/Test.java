package com.code.CollectionDependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/code/CollectionDependencyInjection/config.xml");
		Emp employee=(Emp) context.getBean("emp");
		System.out.println(employee);
	}

}
