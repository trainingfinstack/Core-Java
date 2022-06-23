package com.springrest.Services;
import java.util.*;

import com.springrest.entities.Courses;
public interface CourseService
{
	public List<Courses> getCourses();
	public Courses getCourses(long courseId);
	public Courses addCourses(Courses courses);
}
