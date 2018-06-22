package com.javapractice;

public class StringDemo {

    public static void main(String []args) {
        char []helloArray = {'r', 'u', 'n', 'o', 'o', 'b'};
        String helloString = new String(helloArray);
        System.out.println(helloString);

        // String类是不可改变的，一旦创建了String对象，那它的值就无法改变了
        /**
         * String 操作少量数据
         * StringBuffer 字符串变量，线程安全。多线程操作大量数据
         * StringBuilder 字符串变量，非线程安全。单线程操作大量数据，性能好，常用
         */
        // 面试题1
        String s1 = "abc";                      // 常量池
        String s2 = new String("abc");   // 堆内存中
        System.out.println(s1 == s2);           // false两个对象的地址值不一样
        System.out.println(s1.equals(s2));      // true

        // 面试题2
        String s3 = "a" + "b" + "c";
        String s4 = "abc";
        System.out.println(s3 == s4);           // java中常量优化机制，编译时s1已经成为abc在常量池中查找创建，s2不需要再创建
        System.out.println(s3.equals(s4));

        // 面试题3
        String s5 = "ab";
        String s6 = "abc";
        String s7 = s5 + "c";
        System.out.println(s7 == s6);           // false
        System.out.println(s7.equals(s6));      // true
    }

}
