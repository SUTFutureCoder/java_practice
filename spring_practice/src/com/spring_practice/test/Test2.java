package com.spring_practice.test;

import com.spring_practice.service.JavaWork;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        JavaWork javaWork = (JavaWork)ac.getBean("javawork");
        javaWork.doTest();

    }

}
