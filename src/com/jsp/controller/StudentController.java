package com.jsp.controller;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class StudentController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student student=new Student();
        student.setId(5);
        student.setName("Raju");
        student.setEmail("raju@gamil.com");
        student.setGender("FEMALE");
        student.setPhoneno(771590164);
        
        StudentDao studentDao=new StudentDao();
        studentDao.saveStudent(student);
	}
}
