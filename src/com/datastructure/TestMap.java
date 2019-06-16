package com.datastructure;

import java.util.*;

/**
 * @author xingchen.lin
 * @time 2018/10/14 12:03 PM.
 */
public class TestMap {

    public static void main(String []args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "value1");
        map.put("2", "value2");
        map.put("3", "value3");

        // 1.普遍使用，二次取值
        System.out.println("通过Map.keyset遍历key value");
        for (String key: map.keySet()) {
            System.out.println("key= " + key + " and value= " + map.get(key));
        }

        // 2
        System.out.println("通过Map.entrySet使用iterator遍历key value");
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }

        // 3 推荐，尤其容量大时
        System.out.println("通过Map.entrySet遍历key和value");
        for (Map.Entry<String, String> entry: map.entrySet()) {
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }

        // 4
        System.out.println("通过Map.values()遍历所有value，但不能遍历key");
        for (String v: map.values()) {
            System.out.println("value= " + v);
        }
    }

}
