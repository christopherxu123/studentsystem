package com.halcyoner.studentsystem.service;

import com.halcyoner.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);

    public List<Student> getAllStudents();

}
