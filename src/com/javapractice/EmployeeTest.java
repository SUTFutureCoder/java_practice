package com.javapractice;
import java.io.*;

public class EmployeeTest {

    public static void main(String []args) {
        Employee emp1 = new Employee("A");
        Employee emp2 = new Employee("B");


        emp1.empAge(24);
        emp1.empSalary(114514);
        emp1.empDesignation("KKSK");

        emp2.empAge(19);
        emp2.empSalary(1919);
        emp2.empDesignation("GOD");

        emp1.printEmp();
        emp2.printEmp();
    }

}
