package com.code.autowired.Automatic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext con=new ClassPathXmlApplicationContext("com/code/autowired/Automatic/config.xml");
		Emp emp=(Emp) con.getBean("emp");
		System.out.println(emp);
	}

}
