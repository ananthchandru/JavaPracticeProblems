package com.ananth.arrays.easy;

public class SecondHighest {
	
	public static void main(String[] args) {
	//	int[] array = {2,1,4,5,3};
		int[] array = {4,4};
    //    int[] array = {3,3,4,4};
		
		int secondHighest = 0;
		int highest = 0;

		for(int i=0; i< array.length;i++) {
			if(array[i] > highest) {
                secondHighest = highest;
                highest = array[i];
			} else if(array[i] > secondHighest && array[i] < highest) {
			    secondHighest = array[i];
            }
		}
		System.out.println("Second High: " + secondHighest);
	}
}
