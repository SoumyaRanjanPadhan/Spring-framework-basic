package com.code.springconfig;

import org.springframework.stereotype.Component;

//@Component
public class Student {
	
	private Srp srp;

	public Srp getSrp() {
		return srp;
	}

	public void setSrp(Srp srp) {
		this.srp = srp;
	}

	public Student(Srp srp) {
		super();
		this.srp = srp;
	}

	public void study() {
		this.srp.display();
		System.out.println("student is reading...");
	}
}
