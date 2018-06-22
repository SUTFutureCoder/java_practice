package com.javapractice;

public class VarargsDemo {

    public static void main(String []args) {
        printMax(34, 4, 3, 3, 5, 6, 7, 8, 9);
        printMax(new double[]{1,2,3,4,5,6,7,8});
    }

    public static void printMax(double ...numbers) {
        if (numbers.length == 0) {
            System.out.println("No argument passed");
            return;
        }

        double result = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > result) {
                result = numbers[i];
            }
        }
        System.out.println("The max value is:" + result);
    }

}
