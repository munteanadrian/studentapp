package com.studentapp.studentapp.service;

import com.studentapp.studentapp.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
