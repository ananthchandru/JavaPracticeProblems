package com.ananth.arrays.easy;
import java.util.Arrays;

public class FindMedian {
	
	public static void main(String[] args ) {
	//	int arr[] = {-5,-2,-3,-4,5,1};
	//	int arr[] = {1};
		int arr[] = {17, 3, 19, 3, 8, 17, 1, 12, 19};
		System.out.println("Median : " + findMedian(arr));
	}
	
	public static Object findMedian(int[] arr) {
		int arrayLength = arr.length;
		//Edge case
		if(arrayLength == 0)
			return 0;
		else if(arrayLength == 1)
			return arr[0];

		int medianIndex = arrayLength/2;
		//quick sort
		Arrays.sort(arr);
		if(arrayLength %2==0) {
			return (arr[medianIndex] + arr[medianIndex-1])/2.0;
		} else {
			return arr[medianIndex];
		}
	}
}

//Edge cases

// 1. Input Array might be empty
// 2. Input Array might have negative values