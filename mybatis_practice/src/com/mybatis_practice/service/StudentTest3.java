package com.mybatis_practice.service;

import com.mybatis_practice.mappers.StudentMapper;
import com.mybatis_practice.model.Grade;
import com.mybatis_practice.model.Student;
import com.mybatis_practice.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentTest3 {

    public static Logger logger = Logger.getLogger(StudentTest.class);
    private SqlSession sqlSession = null;
    private StudentMapper studentMapper = null;

    /**
     * 测试方法前调用
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        sqlSession = SqlSessionFactoryUtil.openSession();
        studentMapper = sqlSession.getMapper(StudentMapper.class);
    }

    /**
     * 测试方法后调用
     * @throws Exception
     */
    @After
    public void tearDown() throws Exception {
        sqlSession.close();
    }

    @Test
    public void testFindStudentWithAddress() {
        logger.info("查询学生带地址和年级");
        Student student = studentMapper.findStudentWithAddress(3);
        System.out.println(student);
    }


    @Test
    public void testSearchStudents() {
        logger.info("查询学生待条件");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("gradeId", 2);
        map.put("name", "%li%");
        List<Student> studentList = studentMapper.searchStudents(map);
        System.out.println(studentList);
    }

    @Test
    public void testSearchStudent2() {
        logger.info("根据某一字段查询");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("searchBy", "gradeId");
        map.put("gradeId", 1);
        map.put("name", "%li%");
        List<Student> studentList = studentMapper.searchStudents2(map);
        System.out.println(studentList);
    }

    @Test
    public void testSearchStudents3() {
        logger.info("查询学生待条件");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("gradeId", 2);
        map.put("name", "%li%");
        List<Student> studentList = studentMapper.searchStudents3(map);
        System.out.println(studentList);
    }

    @Test
    public void testSearchStudents4() {
        logger.info("查询学生待条件");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("gradeId", 2);
        map.put("name", "%li%");
        List<Student> studentList = studentMapper.searchStudents4(map);
        System.out.println(studentList);
    }

    @Test
    public void testSearchStudents5() {
        logger.info("查询学生用集合");
        Map<String, Object> map = new HashMap<String, Object>();
        List<Integer> gradeIds = new ArrayList<Integer>();
        gradeIds.add(1);
        gradeIds.add(2);
        map.put("gradeIds", gradeIds);
        List<Student> studentList = studentMapper.searchStudents5(map);
        System.out.println(studentList);
    }

    @Test
    public void testUpdateStudent() {
        logger.info("更新学生");
        Student student = new Student();
        student.setId(1);
        student.setName("zs2");
        student.setAge(24);
        studentMapper.updateStudent(student);
        sqlSession.commit();
    }

    @Test
    public void testSearchStudents6() {
        logger.info("查询学生用集合");
        List<Student> studentList = studentMapper.searchStudents6("%li%", 17);
        System.out.println(studentList);
    }

    @Test
    public void testBoundStudents() {
        logger.info("分页查询学生");
        // 逻辑分页不怎么好
        int offset = 0;
        int limit = 2;
        RowBounds rowBounds = new RowBounds(offset, limit);
        List<Student> studentList = studentMapper.findStudents(rowBounds);
        for (Student student:studentList) {
            System.out.println(student);
        }
    }

    @Test
    public void testBoundStudents2() {
        logger.info("分页查询学生2");
        Map<String, Object> map  = new HashMap<String, Object>();
        map.put("start", 2);
        map.put("size", 2);
        List<Student> studentList = studentMapper.findStudents2(map);
        for (Student student: studentList) {
            System.out.println(student);
        }
    }

    @Test
    public void testAdd2() {
        logger.info("注解方法添加");
        System.out.println(studentMapper.add2(new Student(60, "xuesheng", 24)));
        sqlSession.commit();
    }

    @Test
    public void findStudents3() {
        logger.info("查找所有学生");
        List<Student> studentList = studentMapper.findStudents3();
        for (Student student: studentList) {
            System.out.println(student);
        }
    }

    @Test
    public void findStudentsWithAddress2() {
        logger.info("查找所有学生带地址");
        Student student = studentMapper.findStudentWithAddress(3);
        System.out.println(student);
    }

    @Test
    public void testInsertStudent2() {
        logger.info("查找所有学生带地址");
        System.out.println(studentMapper.insertStudent(new Student(60, "xuesheng", 24)));
    }
}
