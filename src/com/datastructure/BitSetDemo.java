package com.datastructure;

import java.util.BitSet;

/**
 * @author xingchen.lin
 * @time 2018/10/14 11:06 AM.
 */
public class BitSetDemo {

    public static void main(String []args) {
        BitSet bits1 = new BitSet(16);
        BitSet bits2 = new BitSet(16);

        //set more bits
        for (int i = 0; i < 16; i++) {
            if ((i % 2) == 0) {bits1.set(i);}
            if ((i % 5) != 0) {bits2.set(i);}
        }
        System.out.println("Initial pattern in bits1:");
        System.out.println(bits1);
        System.out.println("Initial pattern in bits2:");
        System.out.println(bits2);

        //add bits
        bits2.and(bits1);
        System.out.println("bits2 AND bits1: ");
        System.out.println(bits2);

        //or bits
        bits2.or(bits1);
        System.out.println("bits2 OR bits1: ");
        System.out.println(bits2);

        //xor bits
        bits2.xor(bits1);
        System.out.println("bits2 xor bits1:");
        System.out.println(bits2);

    }

}
