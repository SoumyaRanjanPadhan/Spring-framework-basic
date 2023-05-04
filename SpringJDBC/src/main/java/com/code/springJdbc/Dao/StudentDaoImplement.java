package com.code.springJdbc.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.code.entity.Student;
@Component("stdao")
public class StudentDaoImplement implements StudentDao{
     
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//Getter and setter
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	//spring insert
	public int insert(Student student) {
		
		//insert query
        String query="insert into student values(?,?,?)";
        int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}
	
	
	//spring update
	public int change(Student student) {
		
		//update query
		String query="update student set name=?,city=? where id=?";
		int r=this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return r;
	}
	
	
	//spring delete
	public int delete(int studentId) {
		
		//delete query
		String query="delete from student where id=?";
		int r=this.jdbcTemplate.update(query,studentId);
		return r;
	}
	
	//get single data
	public Student getStudent(int studentId) {
		
		//select query
		String query="select * from student where id=?";
		RowMapper<Student>rowMapper=new rowMapperImpl();
		Student st=this.jdbcTemplate.queryForObject(query, rowMapper,studentId);
		return st;
	}
	
	
	//select all students
	public List<Student> getAllStudents() {
		// select query
		String query="select * from student";
		List<Student> students=this.jdbcTemplate.query(query, new rowMapperImpl());
		return students;
	}

	

}
