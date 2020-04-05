package com.org.cancer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.cancer.mapper.StudentMapper;
import com.org.cancer.pojo.Student;
import com.org.cancer.service.StudentService;
@Service("studentService")
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentMapper studentMapper;
	
	public void setStudentMapper(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}


	@Override
	public void addStudent(Student student) {
		studentMapper.addStudent(student);
		
	}

}
