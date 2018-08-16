package com.mybatis_practice.service;

import com.mybatis_practice.mappers.GradeMapper;
import com.mybatis_practice.mappers.StudentMapper;
import com.mybatis_practice.model.Grade;
import com.mybatis_practice.model.Student;
import com.mybatis_practice.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeTest {

    public static Logger logger = Logger.getLogger(StudentTest.class);
    private SqlSession sqlSession = null;
    private GradeMapper gradeMapper = null;

    /**
     * 测试方法前调用
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        sqlSession = SqlSessionFactoryUtil.openSession();
        gradeMapper = sqlSession.getMapper(GradeMapper.class);
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
    public void testFindGradeWithStudents() {
        logger.info("查询年级带学生");
        Grade grade = gradeMapper.findById(2);
        System.out.println(grade);
    }

}
