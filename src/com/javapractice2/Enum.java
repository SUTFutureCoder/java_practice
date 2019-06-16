package com.javapractice2;

class FreshJuice {
    enum FreshJuiceSize {SMALL, MEDIUM, LARGE}
    FreshJuiceSize size;
}

/**
 * @author xingchen.lin
 * @time 2018/10/10 6:38 PM.
 */
public class Enum {
    public static void main(String []args) {
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.SMALL;
        System.out.println(juice.size);
    }
}
