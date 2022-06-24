package com.user.programme.Services;

import java.util.List;

import com.user.programme.Model.Student;

public interface StudentService 
{
	public List<Student> getAllStudents();
	public Student getStudent(int rollNo);
	public Student updateStudent(Student student);
	public Student deleteStudent(int student);
}
