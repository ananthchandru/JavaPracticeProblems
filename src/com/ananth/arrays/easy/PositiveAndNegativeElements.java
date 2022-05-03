package com.ananth.arrays.easy;

import java.util.ArrayList;

public class PositiveAndNegativeElements {

    public static void main(String[] args) {
        long[] arr = {-5, 2, -6, 1, -1, 9};
        System.out.println(arranged(arr, arr.length));
    }

    static ArrayList<Long> arranged(long a[], int n)
    {
        ArrayList<Long> list= new ArrayList<Long>();
        long[] result = new long[n];
        int positiveCounter = 0;
        int negativeCounter = 1;

        for(int i=0;i<n;i++) {
            if(a[i] >= 0) {
                result[positiveCounter]=a[i];
                positiveCounter+=2;
            } else {
                result[negativeCounter]=a[i];
                negativeCounter+=2;
            }
        }
        for(long l: result){
            list.add(l);
        }
        return list;
    }
}
