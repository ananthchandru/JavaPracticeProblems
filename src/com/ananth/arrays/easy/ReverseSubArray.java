package com.ananth.arrays.easy;

import java.util.Arrays;

public class ReverseSubArray {

    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(arr));
        reverseSubArray(arr, 2, 4);
        System.out.println(Arrays.toString(arr));
    }

    static void reverseSubArray(int[] arr, int left, int right) {
        while(left < right) {
            int temp = arr[left-1];
            arr[left-1] = arr[right-1];
            arr[right-1] = temp;
            left++;
            right--;
        }
    }
}
