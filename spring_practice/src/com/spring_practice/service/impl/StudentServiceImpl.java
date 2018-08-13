package com.spring_practice.service.impl;

import com.spring_practice.dao.StudentDao;
import com.spring_practice.model.Student;
import com.spring_practice.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
//    @Override
//    public void addStudent(String name) {
////        System.out.println("开始添加学生" + name);
//        System.out.println("添加学生" + name);
////        System.out.println("完成添加学生" + name);
//    }

    @Override
    public int addStudent(Student student) {
        return this.studentDao.addStudent(student);
    }

    @Override
    public int updateStudent(Student student) {
        return this.studentDao.updateStudent(student);
    }

    @Override
    public int deleteStudent(int id) {
        return this.studentDao.deleteStudent(id);
    }

    @Override
    public List<Student> findStudents() {
        return this.studentDao.findStudents();
    }
}
