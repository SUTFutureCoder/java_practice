package com.javapractice;
import java.io.*;

public class EmployeeVarA {
    // 这个实例对子类可见
    public String name;
    // 私有变量，仅在该类可见
    private double salary;
    // 在构造器中对name赋值
    public EmployeeVarA (String empName) {
        this.name = empName;
    }
    // 设定salary的值
    public void setSalary(double empSal) {
        this.salary = empSal;
    }

    // 打印信息
    public void printEmp() {
        System.out.println("名字: " + name);
        System.out.println("薪水: " + salary);
    }

    public static void main(String []argc) {
        EmployeeVarA empOne = new EmployeeVarA("RUNOOB");
        empOne.setSalary(114514);
        empOne.printEmp();
    }
}
