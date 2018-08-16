package com.mybatis_practice.service;

import com.mybatis_practice.mappers.StudentMapper;
import com.mybatis_practice.model.Student;
import com.mybatis_practice.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class StudentTest2 {

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
    public void testAdd() {
        logger.info("添加学生");
        Student student = new Student("wangwu", 12);
        studentMapper.add(student);
        sqlSession.commit();
    }

    @Test
    public void testUpdate() {
        logger.info("修改学生");
        Student student = new Student(11, "wangwu2", 14);
        studentMapper.update(student);
        sqlSession.commit();
    }

    @Test
    public void testDelete() {
        logger.info("删除学生");
        studentMapper.delete(11);
        sqlSession.commit();
    }

    @Test
    public void testFindById() {
        logger.info("根据id查询");
        Student student = studentMapper.findById(12);
        System.out.println(student);
    }

    @Test
    public void testFind() {
        logger.info("查询集合");
        List<Student> studentList = studentMapper.find();
        System.out.println(studentList);
    }

}
