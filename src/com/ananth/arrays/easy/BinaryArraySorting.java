package com.ananth.arrays.easy;
import java.util.Arrays;

public class BinaryArraySorting {

    public static void main(String[] args) {
        int[] arr = {1,0,1,0,1,1,0};
        System.out.println(Arrays.toString(sortBinaryArray(arr, arr.length)));
    }

    static int[] sortBinaryArray(int arr[], int n) {
        int i=0, j=n-1;
        while(i<j) {
            while(arr[i] ==0  && i < j) i++; //And condition in while loop avoid arrayIndexOutOfbounds(yet to prove though)
            while(arr[j] ==1  && i < j) j--;
            if(i>=j)
                return arr;
            else {
                //swap is not really required as it is only 2 numbers -0,1
                arr[i]=0;
                arr[j]=1;
            }
            i++;j--;
        }
        return arr;
    }
}
