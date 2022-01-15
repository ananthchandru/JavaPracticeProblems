package com.ananth.arrays.easy;

import java.util.Arrays;

/*
Replace every element with the next greatest element (greatest element on its right side) in the array.
Also, since there is no element next to the last element, replace it with -1
*/

public class ReplaceWithGreatestToTheRight {

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        System.out.println(Arrays.toString(arr));
        replaceWithGreatestToTheRight(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void replaceWithGreatestToTheRight(int[] arr) {
        int n = arr.length;
        int max =  arr[n-1];
        arr[n-1] = -1;
        // last element is always replace with -1

        // Replace all other elements with the next greatest
        for(int i = n-2; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = max;
            // Update the greatest element, if needed
            if(max < temp)
                max = temp;
        }
    }
}