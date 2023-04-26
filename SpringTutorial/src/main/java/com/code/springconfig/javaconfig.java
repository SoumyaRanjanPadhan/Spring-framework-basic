package com.code.springconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.code.springconfig")
public class javaconfig {
	   @Bean
	   public Srp getSrp() {
		   return new Srp();
	   }
     @Bean 
	public Student getStudent() {
		Student student=new Student(getSrp());
		return student;
	}
}
