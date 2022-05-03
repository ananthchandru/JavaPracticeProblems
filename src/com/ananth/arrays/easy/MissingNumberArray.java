package com.ananth.arrays.easy;

public class MissingNumberArray {
	 
    public static void main(String[] args) {
        int[] arr1={7,5,8,6,4,2,3};
        //passing (arr.length+1) as it is the original size including missing number
        System.out.println("Missing number from array arr1: "+missingNumber(arr1, arr1.length+1));
        int[] arr2={5,3,1,2};
        //passing (arr.length+1) as it is the original size including missing number
        System.out.println("Missing number from array arr2: "+missingNumber(arr2, arr2.length+1));
    }
 
    public static int missingNumber(int[] arr, int n) {
        int sum=n*(n+1)/2;
        int restSum=0;
        for (int i = 0; i < arr.length; i++) {
            restSum+=arr[i];
        }
        int missingNumber=sum-restSum;
        return missingNumber;
    }
}
