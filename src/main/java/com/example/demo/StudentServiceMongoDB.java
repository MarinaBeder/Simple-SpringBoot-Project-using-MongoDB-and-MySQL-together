package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceMongoDB {
	
	@Autowired
private StudentRepositoryMongoDB studentRepository;
	
	public List<StudentMongoDB> getAllStudents(){
		return studentRepository.findAll();
	}
	public StudentMongoDB insertStudent(StudentMongoDB student) {
		studentRepository.save(student);	
	return student;
		
	}
	

	
	
	

}
