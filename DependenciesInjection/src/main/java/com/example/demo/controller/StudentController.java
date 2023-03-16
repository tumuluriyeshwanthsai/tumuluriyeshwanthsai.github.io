package com.example.demo.controller;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	
	private final StudentService studentService;
	
	 public StudentController( @Autowired StudentService studentService )
	    {
	        this.studentService = studentService;
	       
	        studentService.add(new Student("554", 1,"Yeshwanth", "Tumuluri", "India", "Khammam", new Date(2000-11-26)));
	    }

	    @GetMapping( "/student/{id}" )
	    Student findById( @PathVariable( "id" ) String id )
	    {
	        return studentService.findById( id );
	    }
}