package com.datastructure;

import java.util.Vector;
import java.util.Enumeration;

/**
 * @author xingchen.lin
 * @time 2018/10/14 11:01 AM.
 */
public class EnumerationTester {

    public static void main(String []args) {
        Enumeration<String> days;
        Vector<String> dayNames = new Vector<>();
        dayNames.add("Sunday");
        dayNames.add("Monday");
        days = dayNames.elements();
        while (days.hasMoreElements()) {
            System.out.println(days.nextElement());
        }
    }

}
