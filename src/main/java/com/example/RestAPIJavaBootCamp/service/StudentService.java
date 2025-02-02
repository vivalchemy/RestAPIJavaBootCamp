package com.example.RestAPIJavaBootCamp.service;

import org.springframework.stereotype.Service;
import com.example.RestAPIJavaBootCamp.model.Student;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

  private List<Student> students = new ArrayList<>(
      Arrays.asList(
          new Student(3, "Mark", "New York")));

  public void addStudent(Student student) {
    students.add(student);
  }

  public List<Student> getStudents() {
    return students;
  }

  public Student getStudent(int rollNumber) {
    for (Student student : students) {
      if (student.getRollNumber() == rollNumber) {
        return student;
      }
    }
    throw new RuntimeException("Student not found");
  }
}
