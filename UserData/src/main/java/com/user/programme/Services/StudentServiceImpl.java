package com.user.programme.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.user.programme.Model.Student;

import ch.qos.logback.core.net.SyslogOutputStream;
@Service
public class StudentServiceImpl implements StudentService
{
	List<Student> students;

	public StudentServiceImpl()
	{
		students= new ArrayList<Student>();
		Student student1=new Student("Kanhaiya",25);
		Student student2=new Student("Abhishek",27);
		Student student3=new Student("Raja",28);
		students.add(student1);
		students.add(student2);
		students.add(student3);
	}
	
	//retrieve list of students from the database
	@Override
	public List<Student> getAllStudents() 
	{
		return students;
	}

	@Override
	public Student getStudent(int rollNo) 
	{
		Student s=null;
		for(Student ss:students)
		{
			if(ss.getRollNo()==rollNo)
			{
				s=ss;
				break;
			}
		}
		return s;
	}

	@Override
	public Student updateStudent(Student student) 
	{
		students.add(student);
		return student;
	}

	@Override
	public Student deleteStudent(int rollNo)
	{
		Student s1=null;
		students.remove(rollNo);
		return s1 ;
	}

}
