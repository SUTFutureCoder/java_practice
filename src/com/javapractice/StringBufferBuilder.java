package com.javapractice;

public class StringBufferBuilder {

    public static void main(String []args) {
        StringBuffer sBuffer = new StringBuffer("string buffer");
        sBuffer.append("test");
        sBuffer.append("test2");

        System.out.println(sBuffer);

        StringBuilder sBuilder = new StringBuilder("string builder");
        sBuilder.append("test");
        sBuilder.append("test2");
        System.out.println(sBuilder);
    }

}
