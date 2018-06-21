package com.javapractice;
import java.io.*;

public class EmployeeVarB {

    // salary是静态的私有变量
    private static double salary;
    // department是一个常量
    public static final String DEPARTMENT = "开发人员";
    public static void main (String []argc) {
        EmployeeVarB.salary = 10000;
        System.out.println(DEPARTMENT + "工资:" + salary);
    }

}
