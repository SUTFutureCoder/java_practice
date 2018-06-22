package com.javapractice;

import java.util.Arrays;

public class ArrayTest {

    public static double[] reverse(double []list) {
        double []result = new double[list.length];
        int i = 0;
        for (double l: list) {
            result[i++] = l;
        }
        return result;
    }

    public static void main(String []args) {
        int size = 5;

        double []myList = new double[size];
        myList[0] = Math.random();
        myList[1] = Math.random();
        myList[2] = Math.random();
        myList[3] = Math.random();
        myList[4] = Math.random();
        // 补充数组
        myList = Arrays.copyOf(myList, myList.length + 1);

        for (double element: myList){
            System.out.println(element);
        }

    }

}
