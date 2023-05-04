package com.code.SpringORM;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.code.SpringORM.dao.StudentDao;
import com.code.SpringORM.entity.StudentDetails;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext con=new ClassPathXmlApplicationContext("config.xml");
        StudentDao stdao=con.getBean("studentDao",StudentDao.class);
        
        //insert 
//        StudentDetails student=new StudentDetails(22,"soumya","balangir");
//        int i = stdao.insert(student);
//        System.out.println("done "+i);
        
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        boolean go=true;
        while(go) {
        System.out.println("Press 1 for add new Student");
        System.out.println("press 2 for display all student");
        System.out.println("press 3 for get single student");
        System.out.println("press 4 for delete student");
        System.out.println("press 5 for update student");
        System.out.println("press 6 for exit");
        
        try {
        	int input = Integer.parseInt(br.readLine());
        	
            switch (input) {
			case 1:
				//add student
				
				System.out.println("Enter student id:");
				int sid=Integer.parseInt(br.readLine());
				
				System.out.println("Enter student name:");
				String sName=br.readLine();
				
				System.out.println("Enter student city:");
				String sCity=br.readLine();
				
				StudentDetails student=new StudentDetails(sid, sName, sCity);
				int ins = stdao.insert(student);
				System.out.println("Student added "+ins);
				break;
			case 2:
				//display all
				
				List<StudentDetails> allStudents = stdao.getAllStudents();
				for(StudentDetails s:allStudents) {
					System.out.println("Name: "+ s.getStudentName());
					System.out.println("Id: "+ s.getStudentId());
					System.out.println("City: "+ s.getStudentCity());
				}
				break;
			case 3:
				//get single student
				System.out.println("Enter student id:");
				int stid=Integer.parseInt(br.readLine());
				
				StudentDetails std=stdao.getStudent(stid);
				System.out.println("Name: "+ std.getStudentName());
				System.out.println("Id: "+ std.getStudentId());
				System.out.println("City: "+ std.getStudentCity());
				
				break;
			case 4:
				//delete student
				System.out.println("Enter student id:");
				int stdid=Integer.parseInt(br.readLine());
				stdao.deleteStudent(stdid);
				System.out.println("delete successful");
				break;
			case 5:
				//update student
				System.out.println("Enter student id:");
				int ssid=Integer.parseInt(br.readLine());
				
				System.out.println("Enter student name:");
				String ssName=br.readLine();
				
				System.out.println("Enter student city:");
				String ssCity=br.readLine();
				
				StudentDetails sd=new StudentDetails(ssid, ssName, ssCity);
				stdao.updateStudent(sd);
				System.out.println("update successful");
				break;
			case 6:
				//exit
				go=false;
				break;
			default:
				break;
			}
        }catch (Exception e) {
			System.out.println("invalid input try again!!!");
			e.printStackTrace();
		}
        }
        System.out.println("Bye bye!!!");
    }
}
