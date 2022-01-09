package com.ananth.maths.easy;

/*Given a street of N houses (a row of houses), each house having K amount of money kept inside;
now there is a thief who is going to steal this money but he has a constraint/rule that
he cannot steal/rob two adjacent houses. Find the maximum money he can rob.*/

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
