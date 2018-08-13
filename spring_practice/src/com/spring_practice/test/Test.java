package com.spring_practice.test;

import com.spring_practice.service.JavaWork;
import com.spring_practice.service.Qa;

public class Test {

    /**
     * 主管执行命令
     * @param args
     */
    public static void main(String[] args) {
        JavaWork javaWork = new JavaWork();
        javaWork.setTester(new Qa());
        javaWork.doTest();
    }

}
