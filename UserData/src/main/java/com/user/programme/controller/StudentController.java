package com.user.programme.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.programme.Model.Student;
import com.user.programme.Services.StudentService;

@RestController
public class StudentController
{
	@Autowired
	StudentService studentservice;
	
	@GetMapping("/getstudent")
	public List<Student> getAllStudent()
	{
		return studentservice.getAllStudents();
	}
	@GetMapping("/getstudent/{rollNumber}")
	public Student getStudent(@PathVariable String rollNumber)
	{
		return studentservice.getStudent(Integer.parseInt(rollNumber));
	}
	@PostMapping("/updatestudent")
	public Student updateStudent(@RequestBody Student student)
	{
		return studentservice.updateStudent(student);
	}
	@DeleteMapping("/deletestudent/{student}")
	public Student deleteStudent(@PathVariable String rollNo)
	{
		return studentservice.deleteStudent(Integer.parseInt(rollNo));
	}
	

}
