package com.ananth.arrays.easy;

public class FindMedian {
	
	public static void main(String[] args ) {
		int arr[] = {-1,-2,-3,-4};
		System.out.println("Median : " + findMedian(arr));
	}
	
	public static Object findMedian(int[] arr) {
		
		int arrayLength = arr.length;
		//Edge case
		if(arrayLength == 0) {
			return 0;
		}
		int medianIndex = arrayLength/2;
		
		for(int i=0;i<=medianIndex;i++) {
			for(int j=0; j<arrayLength-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		if(arrayLength %2==0) {
			return (arr[medianIndex] + arr[medianIndex-1])/2.0;
		} else {
			return arr[medianIndex];
		}
	}
}

//Corner cases

// 1. Input Array might be empty
// 2. Input Array might have negative values

