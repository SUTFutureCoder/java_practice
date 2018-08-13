package com.spring_practice.test;

import com.spring_practice.entity.People;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class T {

    private ApplicationContext ac;

    @Before
    public void setUp() throws Exception {
        ac = new ClassPathXmlApplicationContext("beans.xml");
    }

    @After
    public void tearDown() throws Exception {

    }

    /**
     * 基本类型值 & 注入bean
     */
    @Test
    public void test9() {
        People people = (People)ac.getBean("people9");
        System.out.println(people);
    }

    /**
     * 内部bean
     */
    @Test
    public void test10() {
        People people = (People)ac.getBean("people10");
        System.out.println(people);
    }

    /**
     * 注入none
     */
    @Test
    public void test11() {
        People people = (People)ac.getBean("people11");
        System.out.println(people);
    }

    /**
     * 级联bean
     */
    @Test
    public void test12() {
        People people = (People)ac.getBean("people12");
        System.out.println(people);
    }

    /**
     * 注入集合
     */
    @Test
    public void test13() {
        People people = (People)ac.getBean("people13");
        System.out.println(people);
    }

    /**
     * 注入set
     */
    @Test
    public void test14() {
        People people = (People)ac.getBean("people14");
        System.out.println(people);
    }

    /**
     * 注入map
     */
    @Test
    public void test15() {
        People people = (People)ac.getBean("people15");
        System.out.println(people);
        System.out.println(people.getWorks().get("上午"));
    }

    /**
     * 注入集合
     */
    @Test
    public void test16() {
        People people = (People)ac.getBean("people16");
        System.out.println(people);
    }

    /**
     * 注入方法 (单例)
     */
    @Test
    public void testDog1() {
        System.out.println(ac.getBean("dog") == ac.getBean("dog"));
    }

    /**
     * 注入方法 (多例) scope = prototype
     */
    @Test
    public void testDog2() {
        System.out.println(ac.getBean("dog2") == ac.getBean("dog2"));
    }

    /**
     * 注入方法 很少用到
     */
    @Test
    public void testDog3() {
        People people = (People)ac.getBean("people15");
        People people1 = (People)ac.getBean("people16");
        System.out.println(people.getDog() == people1.getDog());
        System.out.println(ac.getBean("dog2") == ac.getBean("dog2"));
    }

    /**
     * 替换方法
     */
    @Test
    public void testDog4() {
        People people = (People)ac.getBean("people16");
        System.out.println(people.getDog());
    }

    @Test
    public void testPeopleAbstract() {
        People zhangsan = (People)ac.getBean("zhangsan");
        People lisi = (People)ac.getBean("lisi");
        System.out.println(zhangsan);
        System.out.println(lisi);
    }
}
