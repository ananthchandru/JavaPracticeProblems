package com.ananth.arrays.easy;

public class IndexOfOneInSortedArray {
    public static void main(String[] args) {
        long arr[] = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1};
        System.out.println(firstIndex(arr, arr.length));
    }

    static long firstIndex(long arr[], int n) {
        return binarySearch(arr, 0, n-1);
    }

    static long  binarySearch(long[] arr, int low, int high) {
        long firstOccurence = -1;
        while(low<=high) {
            int mid = (low+high)/2;
            if(arr[mid]==1) {
                firstOccurence = mid;
                high = mid-1;
            } else
                low = mid+1;
        }
        return firstOccurence;
    }
}
