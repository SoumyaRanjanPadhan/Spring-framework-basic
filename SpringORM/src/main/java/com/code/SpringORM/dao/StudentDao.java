package com.code.SpringORM.dao;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.code.SpringORM.entity.StudentDetails;

public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	
	//save student
	@Transactional
	public int insert(StudentDetails student) {
		int i=(Integer) this.hibernateTemplate.save(student);
		return i;
	}
	
	//get single object
	public StudentDetails getStudent(int studentId) {
		StudentDetails student=this.hibernateTemplate.get(StudentDetails.class, studentId);
		return student;
	}
	
	//get all student
	public List<StudentDetails> getAllStudents(){
		List<StudentDetails> students=this.hibernateTemplate.loadAll(StudentDetails.class);
		return students;
	}
	
	//delete
	@Transactional
	public void deleteStudent(int studentId) {
		StudentDetails student=this.hibernateTemplate.get(StudentDetails.class, studentId);
		this.hibernateTemplate.delete(student);
	}
	
	//update
	@Transactional
	public void updateStudent(StudentDetails student) {
		this.hibernateTemplate.update(student);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	

}
