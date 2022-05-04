package com.ananth.arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;

public class AbsoluteDifferenceOfOne {

    public static void main(String[] args) {
        long[] arr= {7, 98, 56, 43, 45, 23, 12, 8};
        long[] res = getDigitDiff1AndLessK(arr, arr.length, 54);
        System.out.println(Arrays.toString(res));
    }

    static long[] getDigitDiff1AndLessK(long[] arr, int n, long k) {
        ArrayList<Long> list = new ArrayList<Long>();
        for(int i=0;i<n;i++) {
            if(arr[i] < k) {
                long temp = arr[i];
                boolean isAdjacentDigit = false;
                long prev = -1, curr = -1;

                while(temp>0) {
                    if(prev==-1 && curr ==-1) {
                        curr = temp%10;
                    } else {
                        prev = curr;
                        curr = temp%10;
                        if(Math.abs(curr-prev)==1) {
                            isAdjacentDigit = true;
                        } else {
                            isAdjacentDigit=false;
                            break;
                        }
                    }
                    temp /=10;
                }
                if(isAdjacentDigit) {
                    list.add(arr[i]);
                }
            }
        }
        return list.stream().mapToLong(x->x).toArray();
    }
}
