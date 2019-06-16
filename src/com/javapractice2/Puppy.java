package com.javapractice2;

/**
 * @author xingchen.lin
 * @time 2018/10/10 6:42 PM.
 */
public class Puppy {
    int puppyAge;
    public Puppy(String name) {
        System.out.println(name);
    }

    public void setPuppyAge(int age) {
        puppyAge = age;
    }

    public int getPuppyAge() {
        System.out.println(puppyAge);
        return puppyAge;
    }

    public static void main(String []args) {
        Puppy myPuppy = new Puppy("tommy");
        myPuppy.setPuppyAge(2);
        myPuppy.getPuppyAge();
        System.out.println(myPuppy.puppyAge);
    }

}
