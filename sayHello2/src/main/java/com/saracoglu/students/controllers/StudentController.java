package com.saracoglu.students.controllers;

import com.saracoglu.students.models.Student;
import com.saracoglu.students.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/students")
public class StudentController {
    //@Autowired
    private StudentService _studentService;

    public StudentController(StudentService studentService) {
        this._studentService = studentService;
    }

    @GetMapping
    public List<Student> getAllStudents()
    {
        return _studentService.getAllStudents();
    }


    @PostMapping
    public void addStudent(@RequestBody Student student)
    {
        _studentService.addStudent(student);
    }

    @DeleteMapping
    public void removeStudent(@RequestBody Student student)
    {
        _studentService.removeStudent(student);
    }

}
