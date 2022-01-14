package com.ananth.arrays.easy;

/* Also part of bitmagic*/
/*
Given an array of N positive integers where all numbers occur
even number of times except one number which occurs odd number of times.
Find the exceptional number.
*/

public class ExceptionallyOdd {

    public static void main(String[] args) {
        ExceptionallyOdd occur = new ExceptionallyOdd();
        int arr[] = new int[] {2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
        System.out.println(occur.getOddOccurrence(arr));
    }

    int getOddOccurrence(int arr[]) {
        int num = 0;
        for (int i = 0; i < arr.length; i++)
            num = num ^ arr[i];
        return num;
    }
}
