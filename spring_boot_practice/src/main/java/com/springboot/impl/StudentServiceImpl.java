package com.springboot.impl;

import com.springboot.dao.StudentDao;
import com.springboot.entity.Student;
import com.springboot.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 学生信息service实现类
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;

    @Override
    public void add(Student student) {
        studentDao.save(student);
    }
}
