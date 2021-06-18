package com.ananth.arrays.easy;

public class SecondHighest {
	
	public static void main(String[] args) {
	//	int[] arr = {1,2,3,4,5};
		int[] array = {2,1,4,5,3};
	//	int[] arr = {5,4,3,2,1};
		
		int secondHighest = 0;
		int highest = 0;
		
        for (int i = 0; i < array.length; i++) { 
            // If current element is greater than highest
            if (array[i] > highest) {
                secondHighest = highest;
                highest = array[i];
            } else if (array[i] > secondHighest && array[i]!=highest)
                // Just replace the second highest
                secondHighest = array[i];
        }
		
//		if(arr[0] > arr[1]) {
//			high = arr[0];
//			secondHigh = arr[1];
//		}
//		
//		for(int i=2; i< arr.length;i++) {
//			if(arr[i] > high) {
//				secondHigh = high;
//				high = arr[i];
//			}
//		}
		
		System.out.println("Second High: " + secondHighest);
	}
	


}
