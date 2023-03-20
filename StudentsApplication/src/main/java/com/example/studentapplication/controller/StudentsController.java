package com.example.studentapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentapplication.data.entity.Student;
import com.example.studentapplication.service.StudentService;

@RestController

public class StudentsController {

    private final StudentService studentService;


    public StudentsController(@Autowired StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/student")
    public  Iterable<Student> all() {
        return studentService.all();
    }

    @GetMapping("/student/{id}")
    public Student get( int studentId ) {
        return studentService.findById(studentId);
    }

    @PostMapping("/student")
    public void save(@RequestBody Student student) {
        studentService.save(student);
    }

    @PutMapping("/student")
    public void update(@RequestBody Student student) {
        studentService.save(student);
    }

    @DeleteMapping("/student/{id}")
    public void delete(@PathVariable String id) {
        studentService.deleteById(id);
    }
}