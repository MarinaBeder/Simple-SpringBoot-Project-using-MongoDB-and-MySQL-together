package com.example.demo;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student-MongoDB")
public class StudentControllerMongoDB  {
@Autowired
	private StudentServiceMongoDB studentService;
	

	@GetMapping("")
	public List<StudentMongoDB> fetchAllStudents(){
		return studentService.getAllStudents();
	}
	
	@PostMapping("")
	public StudentMongoDB insertNewStudent(@RequestBody StudentMongoDB student){

		 return studentService.insertStudent(student);
	}
	
	
}
