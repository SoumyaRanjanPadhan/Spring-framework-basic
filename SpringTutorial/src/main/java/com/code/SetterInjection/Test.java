package com.code.SetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Test 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context=new ClassPathXmlApplicationContext("com/code/SetterInjection/config.xml");
        Student student=(Student) context.getBean("std");
        Student student1=(Student) context.getBean("std1");
        System.out.println(student);
        System.out.println(student1);
        
    }
}
