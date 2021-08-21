package com.ananth.bitmagic.easy;

public class CheckSetBits {

    public static void main (String[] args) {
        int input = 63;
        if(isBitSet(input)==1)
            System.out.println("All bits set");
        else
            System.out.println("All bits not set");

    //    System.out.println(isBitSet2(input));
    }

    static int isBitSet(int n) {
        if(n!=0 && (n & n+1)==0)
            return 1;
        return 0;
    }

    //One More approach
    static int isBitSet2(int n) {
        if(n!=0 && (Math.pow(2, Integer.bitCount(n)) -1)==n)
            return 1;
        return 0;
    }
}
