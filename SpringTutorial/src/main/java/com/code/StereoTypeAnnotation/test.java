package com.code.StereoTypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext con=new ClassPathXmlApplicationContext("com/code/StereoTypeAnnotation/config.xml");
		Student student=(Student) con.getBean("ob");
		System.out.println(student);
		System.out.println(student.getAddress());
		System.out.println(student.hashCode());  //singletone scope
		
		
		//prototype scope
		Student std=(Student) con.getBean("ob");
		System.out.println(std.hashCode());
		Student st=(Student) con.getBean("ob");
		System.out.println(st.hashCode());
	}

}
