package com.springrest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.Services.CourseService;
import com.springrest.entities.Courses;

@RestController
public class MyController 
{
	@Autowired
	private CourseService courseService;
	
	@GetMapping
	public String home()
	{
		return "Welcome to Courses application";
	}
	
	//get the courses
	@GetMapping("/courses")
	public List<Courses> getCourses()
	{
		return this.courseService.getCourses();
	}
	@GetMapping("/courses/{courseId}")
	public Courses getCourses(@PathVariable String courseId)
	{
		return this.courseService.getCourses(Long.parseLong(courseId));
	}
	@PostMapping("/courses")
	public Courses addCourse(@RequestBody Courses courses)
	{
		return this.courseService.addCourses(courses);
	}
}
