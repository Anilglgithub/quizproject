package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import com.example.demo.Service.CoursesService;
import com.example.demo.model.Courses;
@RestController
public class CoursesController {
	
	
	@Autowired
	private CoursesService coursesservice;

	@PostMapping("/save")
	public ResponseEntity<Courses> savecourses(@RequestBody Courses course){
		Courses status=coursesservice.saveCourses(course);
		return new ResponseEntity<>(status,HttpStatus.CREATED);
}
	
	     @GetMapping("/get/{id}")
           public ResponseEntity<Courses>getCoursesbyid(@PathVariable("id")Integer id){
	    	 Courses cour=coursesservice.getcourses(id);
	    	 return new ResponseEntity<>(cour,HttpStatus.OK);
	    	 
	    	}	
	
	     
	    /* @GetMapping("/getall")
	     public ResponseEntity<List<Courses>>getallcourses(){
	     List<Courses>cor=coursesservice.getallcourses();
	     return new ResponseEntity<>(cor,HttpStatus.OK);
	     }*/


	  /*   @PutMapping("/update")
	 	public ResponseEntity<String> updatecourses(@RequestBody Courses course){

	 		String status=coursesservice.saveCourses(course);
	 		return new ResponseEntity<>(status,HttpStatus.CREATED);
	 }*/

	     @DeleteMapping("/delete/{id}")
         public ResponseEntity<Courses>deleteCoursesbyid(@PathVariable("id")Integer id){
	    	 Courses cour=coursesservice.getcourses(id);
	    	 return new ResponseEntity<>(cour,HttpStatus.OK);
	    	 
	    	}	
	     
	     
}


