package com.spring_practice.service;

import com.spring_practice.model.Student;

import java.util.List;

public interface StudentService {

    public int addStudent(Student student);

    public int updateStudent(Student student);

    public int deleteStudent(int id);

    public List<Student> findStudents();

}
