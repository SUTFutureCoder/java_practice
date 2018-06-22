package com.javapractice;

public class InstanceCounter {

    private static int numInstances = 0;

    protected static int getCount() {
        return numInstances;
    }

    private static void addNumInstances() {
        numInstances++;
    }

    InstanceCounter() {
        addNumInstances();
    }

    public static void main(String []args) {
        System.out.println("Starting With " + InstanceCounter.getCount() + " instances");
        for (int i = 0; i < 50; i++) {
            new InstanceCounter();
        }
        System.out.println("Created " + InstanceCounter.getCount() + " instances");
    }

}
