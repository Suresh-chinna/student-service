package com.student.manage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.manage.domain.Student;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {
	
	@GetMapping("/getStudent")
	public Student getStudent() {
		Student student = new Student(2,"suresh","s","kosireddi","male",24);
		return student;
		
	}
}
