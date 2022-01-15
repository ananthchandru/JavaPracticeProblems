package com.ananth.arrays.easy;

public class MaxProductofTwoNumbers {

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 6, 7, 0};

        int secondHighest = arr[0];
        int highest = arr[0];

        for(int i=0; i< arr.length;i++) {
            if(arr[i] > highest) {
                secondHighest = highest;
                highest = arr[i];
            } else if(arr[i] > secondHighest && arr[i] < highest) {
                secondHighest = arr[i];
            }
        }
        System.out.println("MaxProductOfTwoNumbers: " + (secondHighest*highest));
    }
}
