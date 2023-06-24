package com.example.demo.Service;

import java.util.List;

import com.example.demo.model.Courses;

public interface CoursesService {
	
	public Courses saveCourses(Courses courses); 
	public Courses getcourses(Integer id);
	//public List<Courses>getallcourses();
	public String deleteall(Integer id);
}
