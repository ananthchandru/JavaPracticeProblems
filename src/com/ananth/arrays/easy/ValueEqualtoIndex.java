package com.ananth.arrays.easy;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ValueEqualtoIndex {
	public static void main (String[] args) {
		int[] arr = {0,45,3,5,5,7,7};
		List<Integer> indexArrays = valueEqualToIndex(arr);
		System.out.println(indexArrays.toString());
	}
	
	public static ArrayList<Integer> valueEqualToIndex(int[] arr) {
		int inputArrayLength = arr.length;
		ArrayList<Integer> indexArrayList = new ArrayList<Integer>();
		int[] indexArrays = new int[inputArrayLength];
		for(int i=0;i<inputArrayLength;i++) {
			if(arr[i]==i+1) {
				indexArrayList.add(arr[i]);
			}
		}
		return indexArrayList;
	}
}

//Edge cases

//1. Input array is empty
//2. Input array has negative values
//3. Input array is of different datatype 