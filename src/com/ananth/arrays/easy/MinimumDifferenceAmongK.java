package com.ananth.arrays.easy;

import java.util.Arrays;

public class MinimumDifferenceAmongK {

    public static void main(String[] args) {
        //long arr[] = {10, 100, 300, 200, 1000, 20, 30};
        long arr[] = {430, 149, 41, 289, 338, 405, 100, 69, 436};
        System.out.println(minDiff(arr, 9, 6));
    }

    static long minDiff(long a[] ,int N,int K)
    {
        Arrays.sort(a);
        long min = Long.MAX_VALUE;
        for(int i=0;i<=N-K;i++) {
            long diff = a[i+K-1] - a[i];
            if(diff < min) {
                min = diff;
            }
        }
        return min;
    }
}
