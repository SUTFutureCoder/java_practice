package com.spring_practice.test;

import com.spring_practice.dao.StudentDao;
import com.spring_practice.dao.impl.StudentDaoImpl;
import com.spring_practice.model.Student;
import com.spring_practice.service.StudentService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestStudentService {

    private ApplicationContext ac;

    @Before
    public void setUp() throws Exception {
        ac = new ClassPathXmlApplicationContext("beans.xml");
    }

//    @Test
//    public void test1() {
//        StudentService studentService = (StudentService)ac.getBean("studentService");
//        studentService.addStudent("张三");
//    }

    @Test
    public void addStudent() {
//        StudentDaoImpl studentDao = (StudentDaoImpl) ac.getBean("studentDao");
//        int addNums = studentDao.addStudent(new Student("Lin", 17));
//        System.out.println(addNums);
//        if (addNums == 1) {
//            System.out.println("添加成功");
//        }
        StudentService studentService = (StudentService) ac.getBean("studentService");
        int addNums = studentService.addStudent(new Student("Lin", 17));
        System.out.println(addNums);
        if (addNums == 1) {
            System.out.println("添加成功");
        }
    }

    @Test
    public void updateStudent() {
//        StudentDaoImpl studentDao = (StudentDaoImpl) ac.getBean("studentDao");
//        int addNums = studentDao.addStudent(new Student("Lin", 17));
//        System.out.println(addNums);
//        if (addNums == 1) {
//            System.out.println("添加成功");
//        }
        StudentService studentService = (StudentService) ac.getBean("studentService");
        int addNums = studentService.updateStudent(new Student("Lnn", 17));
        System.out.println(addNums);
        if (addNums == 1) {
            System.out.println("修改成功");
        }
    }

    @Test
    public void deleteStudent() {
        StudentService studentService = (StudentService)ac.getBean("studentService");
        int deleteNum = studentService.deleteStudent(5);
        if (deleteNum == 1) {
            System.out.println("删除成功");
        }
    }

    @Test
    public void findStudents() {
        StudentService studentService = (StudentService)ac.getBean("studentService");
        List<Student> studentList = studentService.findStudents();
        for (Student s: studentList) {
            System.out.println(s);
        }
    }
}
