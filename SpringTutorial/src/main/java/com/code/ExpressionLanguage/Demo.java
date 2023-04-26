package com.code.ExpressionLanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
    @Value("#{22+11}")
	private int x;
    
	@Value("#{T(java.lang.Math).PI}")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(144)}")
	private int z;
	
	@Value("#{new String('soumya')}")
	private String name;
	
	@Value("#{7<3}")
	private boolean isActive;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", name=" + name + ", isActive=" + isActive + "]";
	}
	
	
	
}
