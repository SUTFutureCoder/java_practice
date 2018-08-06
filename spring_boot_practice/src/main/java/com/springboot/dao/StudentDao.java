package com.springboot.dao;

import com.springboot.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 学生信息接口
 */
public interface StudentDao extends JpaRepository<Student, Integer> {
}
