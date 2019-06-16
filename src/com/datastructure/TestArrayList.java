package com.datastructure;

import java.util.*;

/**
 * @author xingchen.lin
 * @time 2018/10/14 12:00 PM.
 */
public class TestArrayList {

    public static void main(String []args) {
        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("HAHAHAHA");
        // 1.foreach
        for (String str: list) {
            System.out.println(str);
        }

        // 2.数组内容
        String[] strArray = new String[list.size()];
        list.toArray(strArray);
        for (String str: strArray) {
            System.out.println(str);
        }

        // 3.迭代器
        Iterator<String> ite = list.iterator();
        while (ite.hasNext()) {
            System.out.println(ite.next());
        }
    }

}
