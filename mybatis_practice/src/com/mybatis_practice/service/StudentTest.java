package com.mybatis_practice.service;

import com.mybatis_practice.mappers.StudentMapper;
import com.mybatis_practice.model.Student;
import com.mybatis_practice.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

public class StudentTest {

    private static Logger logger = Logger.getLogger(StudentTest.class);

    public static void main(String[] args) {
        SqlSession sqlSession = SqlSessionFactoryUtil.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student student = new Student("lisi", 200);
        int result = studentMapper.add(student);
        sqlSession.commit(); //提交事务
        if (result > 0) {
            logger.info("添加成功");
        } else {
            logger.info("添加失败");
        }
    }

}
