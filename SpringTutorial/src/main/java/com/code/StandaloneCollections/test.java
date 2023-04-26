package com.code.StandaloneCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		ApplicationContext context=new ClassPathXmlApplicationContext("com/code/StandaloneCollections/config.xml");
	    person per1=(person) context.getBean("per1");
	    
	    System.out.println(per1);
	    
	}

}
