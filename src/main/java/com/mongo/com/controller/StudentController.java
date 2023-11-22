package com.mongo.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.com.document.Student;
import com.mongo.com.document.User;
import com.mongo.com.repository.primary.UserRepository;
import com.mongo.com.repository.secondary.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public User addNewUsers(@RequestBody User user) {


		return userRepository.save(user);
	}	
	
	@RequestMapping(value = "/create/student", method = RequestMethod.POST)
	public Student addNewStudent(@RequestBody Student user) {
		return studentRepository.save(user);
	}	
}
