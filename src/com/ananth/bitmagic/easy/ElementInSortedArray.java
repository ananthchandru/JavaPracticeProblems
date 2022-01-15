package com.ananth.bitmagic.easy;

//similar to

public class ElementInSortedArray {

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65};
        System.out.println(findElement(arr));
    }

    public static int findElement(int[] arr) {
       int num = 0;
       for(int i=0;i<arr.length;i++)
           num = num ^ arr[i];
       return num;
    }

}
