package com.hyper;

import java.util.*;

/**
 *
 * 类型通配符一般是使用?代替具体的类型参数。List<?>在逻辑上是List<String> List<Integer>等所有List<具体类型实参>的父类
 *
 * @author xingchen.lin
 * @time 2018/10/14 4:27 PM.
 */
public class GenericTest {

    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        List<Integer> age = new ArrayList<>();
        List<Number> numbers = new ArrayList<>();


        name.add("icon");
        age.add(18);
        numbers.add(314);

        getData(name);
        getData(age);
        getData(numbers);

        getUperNumber(age);
        getUperNumber(numbers);
    }

    private static void getData(List<?> data) {
        System.out.println("data: " + data.get(0));
    }

    // 通配符泛型值接受Number及其下层子类类型
    private static void getUperNumber(List<? extends Number> data) {
        System.out.println("data: " + data.get(0));
    }

}
