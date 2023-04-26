package com.code.springconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.code.springconfig")
public class javaconfig {
	   @Bean
	   public Samosa getSamosa() {
		   return new Samosa();
	   }
     @Bean 
	public Student getStudent() {
		Student student=new Student(getSamosa());
		return student;
	}
}
