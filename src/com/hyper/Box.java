package com.hyper;

/**
 * @author xingchen.lin
 * @time 2018/10/14 4:24 PM.
 */
public class Box<T> {

    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return this.t;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        Box<String> stringBox = new Box<>();

        integerBox.add(10);
        stringBox.add("hello world");

        System.out.println(integerBox.get());
        System.out.println(stringBox.get());
    }

}
