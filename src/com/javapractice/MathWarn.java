package com.javapractice;

public class MathWarn {

    public static void main(String []args) {
        /**
         * Integer i1 = 128 装箱，相当于Integer.valueOf(128)
         * int t = i1 相当于 i1.intValue()装箱
         * System.out.println(t);
         */

        /**
         * 对于-128到127之间的值，被装箱后会被放在内存里进行重用
         * 但是如果超出了这个值，系统会重新new一个对象
         */
        Integer i1 = 200;
        Integer i2 = 200;

        /**
         * 注意==与equals的区别
         * == 与比较的是对象的地址
         * equals比较的是对象的内容
         */
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
    }

}
