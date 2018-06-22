package com.javapractice;

public class SingleTonDCL {

    private static volatile SingleTonDCL instance;
    private SingleTonDCL(){}
    public static SingleTonDCL getInstance() {
        if (instance == null) {
            synchronized (SingleTonDCL.class) {
                if (instance == null) {
                    instance = new SingleTonDCL();
                }
            }
        }
        return instance;
    }
}
