package ds.arrays;

import java.util.ArrayList;

public class ValueEqualtoIndex {
	public static void main (String[] args) {
		int[] arr = {0,45,3,5,5,7,7};
		ArrayList<Integer> indexArrays = valueEqualToIndex(arr);
		for(int element : indexArrays) {
			System.out.println(element);
		}
		
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

//Corner cases

//1. Input array is empty
//2. Input array has negative values
//3. Input array is of different datatype 