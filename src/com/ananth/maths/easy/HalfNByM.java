package com.ananth.maths.easy;

public class HalfNByM {
    public static void main (String[] args) {
        int output = mthHalf(100, 4);
        System.out.println(output);
    }

    static int mthHalf(int N, int M){
        int count = 0;
        for(int i=1; i<M; i++)
            N=N/2;
        return N;
    }
}
