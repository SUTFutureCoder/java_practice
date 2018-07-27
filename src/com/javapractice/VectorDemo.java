package com.javapractice;

import java.util.Collections;
import java.util.Vector;

public class VectorDemo {

    String[] names = {
            "Spanky", "Alfalfa", "Buckwheat", "Daria",
            "Stymie", "Marianne", "Scotty", "Tommy", "Chubby",
    };

    public VectorDemo(String[] moreNames) {
        Vector<String> list = new Vector<String>();
        for (String name: names) {
            list.add(name);
        }
        for (String moreName: moreNames) {
            list.add(moreName);
        }
        Collections.sort(list);
        for (String name: list) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        VectorDemo lister = new VectorDemo(args);
    }
}
