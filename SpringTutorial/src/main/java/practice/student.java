package practice;

import org.springframework.beans.factory.annotation.Autowired;

public class student {
	
	private String name;
	private String city;
	@Autowired
	private marks mark;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public student(String name, String city, marks mark) {
		super();
		this.name = name;
		this.city = city;
		this.mark=mark;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", city=" + city + ",mark="+mark+"]";
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public marks getMark() {
		return mark;
	}
	public void setMark(marks mark) {
		this.mark = mark;
	}
	
	

}
