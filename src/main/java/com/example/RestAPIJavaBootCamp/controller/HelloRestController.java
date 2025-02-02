package com.example.RestAPIJavaBootCamp.controller;

import com.example.RestAPIJavaBootCamp.model.Student;
import com.example.RestAPIJavaBootCamp.service.StudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

  @Autowired
  private StudentService service;

  @RequestMapping(path ="/student", method = RequestMethod.POST)
  public String addStudent(@RequestBody Student student) {
    service.addStudent(student);
    return "SUCCESS";
  }

  @RequestMapping(path = "/student", method = RequestMethod.GET)
  public List<Student> getStudents() {
    return service.getStudents();
  }

  @RequestMapping(path = "/student/{rollNumber}", method = RequestMethod.GET)
  public Student getStudent(@PathVariable("rollNumber") int rollNumber) {
    return service.getStudent(rollNumber);
  }
}
