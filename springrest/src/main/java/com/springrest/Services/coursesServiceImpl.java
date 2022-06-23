package com.springrest.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.entities.Courses;
@Service
public class coursesServiceImpl implements CourseService
{
	List<Courses> list;

	
	public coursesServiceImpl() 
	{
		list=new ArrayList<>();
		list.add(new Courses(145, "Java Core Course", "this course contains basics of java"));
		list.add(new Courses(146, "Spring boot course","creating rest api using spring boot"));
		
	}


	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}


	@Override
	public Courses getCourses(long courseId) {
		Courses c=null;
		for(Courses courses:list)
		{
			if(courses.getId()==courseId)
			{
				c=courses;
				break;
			}
		}
		return c;
	}


	@Override
	public Courses addCourses(Courses courses) {
		list.add(courses);
		return courses;
	}

}
