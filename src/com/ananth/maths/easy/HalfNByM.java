package com.ananth.maths.easy;

public class HalfNByM {

    public static void main (String[] args) {
       mthHalf(100, 4);
    }

    static void mthHalf(int N, int M){
        int count = 0;
        System.out.println(N);
        for(int i=1; i<M; i++)
            System.out.println(N=N/2);
    }
}
