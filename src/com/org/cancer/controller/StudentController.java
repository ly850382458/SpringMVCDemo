package com.org.cancer.controller;

import com.org.cancer.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.org.cancer.service.StudentService;

@Controller
@RequestMapping("StudentController")
public class StudentController {
	@Autowired
	@Qualifier("studentService")
	private StudentService studentService;
	
	@RequestMapping("addStudent")
	public String addStudent(Student student) {
		studentService.addStudent(student) ;
		return "result" ;
	} 

}
