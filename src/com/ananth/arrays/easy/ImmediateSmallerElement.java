package com.ananth.arrays.easy;

import java.util.Arrays;

public class ImmediateSmallerElement {

    public static void main(String[] args) {

        int arr[] = {4, 2, 1, 5, 3};
        minDiff(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void minDiff(int arr[], int n) {
        int prev = arr[n-1];
        arr[n-1] = -1;
        for(int i=n-2;i>=0;i--) {
            if(arr[i]>prev) {
                int temp = arr[i];
                arr[i] = prev;
                prev = temp;
            } else {
                prev = arr[i];
                arr[i] = -1;
            }
        }
    }

}
