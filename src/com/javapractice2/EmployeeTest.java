package com.javapractice2;

/**
 * @author xingchen.lin
 * @time 2018/10/11 2:14 PM.
 */
public class EmployeeTest {

    public static void main(String []args) {
        Employee employee = new Employee("RUNOOB1");
        Employee employee1 = new Employee("RUNOOB2");

        employee.empAge(26);
        employee.empDesignation("test");
        employee.empSalary(1000);
        employee.printEmployee();

    }

}
