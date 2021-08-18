package com.ananth.maths.easy;

public class MaximumMoney {
    public static void main (String[] args) {
        int output = maximizeMoney(5, 10);
        System.out.println(output);
    }

    static int maximizeMoney(int N , int K) {
        if(N%2!=0)
            return K*((N+1)/2);
        else
            return K*(N/2);
    }
}
