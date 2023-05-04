package com.code.springJdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.code.entity.Student;
import com.code.springJdbc.Dao.StudentDao;
import com.code.springJdbc.Dao.StudentDaoImplement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext con=new AnnotationConfigApplicationContext(jdbcConfig.class);
        
        StudentDao sdi=con.getBean("stdao",StudentDao.class);
        
        
          //insert
        
//        Student st=new Student();
//        st.setId(25);
//        st.setName("hari");
//        st.setCity("del");
//        int res=sdi.insert(st);
//        System.out.println("student added");
        
        
          //update 
        
//        Student st=new Student();
//        st.setId(24);
//        st.setName("hari");
//        st.setCity("delhi");
//        int res=sdi.change(st);
//        System.out.println("update successfull "+res);
        
        
          //delete
        
//          int res=sdi.delete(22);
//          System.out.println("delete done");
        
        
        
          //select single data
        
//          Student st=sdi.getStudent(10);
//          System.out.println(st);
        
        
         //select all Students
        List<Student> st1=sdi.getAllStudents();
        for(Student s:st1) {
        	System.out.println(s);
        }
        
    }
}
