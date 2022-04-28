package com.ananth.arrays.easy;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,5,5,5,5,7,8,9};
        System.out.println(count(arr, arr.length, 5));
    }

    static int count(int[] arr, int n, int x) {
        int startingIndex = binarySearch(arr, 0, n, x, true);
        int endingIndex = binarySearch(arr, 0, n, x, false);
        int count = endingIndex-startingIndex+1;
        return count;
    }

    static int binarySearch(int[] arr, int left, int right, int key, boolean isFirst) {
        int index = -1;
        while(left<=right) {
            int mid = left + ((right-left)/2);
            if(key==arr[mid]) {
                index=mid;
                if(isFirst)
                    right = mid-1;
                else
                    left = mid+1;
            } else if(key < arr[mid])
                right = mid-1;
            else if(key > arr[mid])
                left = mid+1;
        }
        return index;
    }
}
