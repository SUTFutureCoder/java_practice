package com.spring_practice.test;

import com.spring_practice.entity.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPeople {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        People people = (People)ac.getBean("people");
        System.out.println(people);

        // 属性注入
        People people2 = (People)ac.getBean("people2");
        System.out.println(people2);

        // 构造方法注入
        People people3 = (People)ac.getBean("people3");
        System.out.println(people3);

        // 构造方法 - 索引方法注入
        People people4 = (People)ac.getBean("people4");
        System.out.println(people4);

        // 构造方法 - 联合注入
        People people5 = (People)ac.getBean("people5");
        System.out.println(people5);

        // 工厂方法注入
        People people7 = (People)ac.getBean("people7");
        System.out.println(people7);

        // 静态工厂方法注入
        People people8 = (People)ac.getBean("people8");
        System.out.println(people8);

    }

}
