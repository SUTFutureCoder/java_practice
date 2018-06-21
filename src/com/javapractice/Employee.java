package com.javapractice;
import java.io.*;

public class Employee {

    String  name;
    int     age;
    String  designation;
    double  salary;

    public Employee(String name) {
        this.name = name;
    }

    public void empAge(int empAge) {
        this.age = empAge;
    }

    public void empDesignation(String empDesi) {
        this.designation = empDesi;
    }

    public void empSalary(double salary) {
        this.salary = salary;
    }

    public void printEmp() {
        System.out.println("name:"  + this.name);
        System.out.println("age:"   + this.age);
        System.out.println("desi:"  + this.designation);
        System.out.println("salary:"    + this.salary);
    }
}
