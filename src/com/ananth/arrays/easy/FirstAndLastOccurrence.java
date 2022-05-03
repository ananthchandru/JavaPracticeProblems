package com.ananth.arrays.easy;

import java.util.ArrayList;

public class FirstAndLastOccurrence {

    public static void main(String[] args) {
        long[] arr= {1, 3, 5, 5, 5, 5, 67, 123, 125};
        System.out.println(find(arr, arr.length, 5));
    }

    static ArrayList<Long> find(long arr[], int n, int x)
    {
        long firstIndex = binarySearch(arr, 0, n-1, x, true);
        long lastIndex = binarySearch(arr, 0, n-1, x, false);
        ArrayList<Long> arrList = new ArrayList<Long>();
        arrList.add(firstIndex);
        arrList.add(lastIndex);
        return arrList;
    }

    static long binarySearch(long[] arr, int left, int right, long key, boolean isFirst) {
        long index = -1;
        while(left<=right) {
            int mid = (left+right)/2;
            if(arr[mid]==key) {
                if(isFirst) {
                    right = mid-1;
                } else {
                    left = mid+1;
                }
                index = mid;
            } else if(arr[mid] > key) {
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return index;

    }
}
