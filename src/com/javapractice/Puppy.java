package com.javapractice;

public class Puppy {
    int puppyAge;

    private Puppy(String name) {
        System.out.println("Hello World " + name);
    }

    private void setPuppyAge(int age) {
        puppyAge = age;
    }

    private int getPuppyAge() {
        System.out.println(puppyAge);
        return puppyAge;
    }

    public static void main(String []args) {
        Puppy myPuppy = new Puppy("abc123");
        myPuppy.setPuppyAge(24);
        System.out.println(myPuppy.getPuppyAge());
        System.out.println("变量值:" + myPuppy.puppyAge);
    }
}
