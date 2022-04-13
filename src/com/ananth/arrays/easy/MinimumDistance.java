package com.ananth.arrays.easy;

public class MinimumDistance {

    public static void main(String[] args) {
        int[] arr = {0, 5, 8, 1, 6, 7, 5};
        System.out.println(minDist1(arr, arr.length, 5, 6));
//        int[] arr = {1, 2, 3, 2};
//        System.out.println(minDist1(arr, arr.length, 1, 4));
    }

    //Method 1: O(N^2) - two loops

    static int minDist(int arr[], int n, int x, int y) {
        int min_distance = Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++) {
            for(int j=i+1;j<n;j++) {
                if((arr[i]==x && arr[j]==y) || (arr[j]==x && arr[i]==y)
                        && min_distance > Math.abs(i-j)) {
                    min_distance = Math.abs(i-j);
                }
            }
        }
        return min_distance;
    }

    //Shorter code O(n)
    static int minDist1(int arr[], int n, int x, int y) {
        //previous index and min distance
        int prev = -1, min_dist = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x || arr[i] == y) {
                //we will check if p is not equal to -1 and
                //If the element at current index matches with
                //the element at index p , If yes then update
                //the minimum distance if needed
                if (prev != -1 && arr[i] != arr[prev])
                    min_dist = Math.min(min_dist, i - prev);
                //update the previous index
                prev = i;
            }
        }
        //If distance is equal to int max
        if (min_dist == Integer.MAX_VALUE)
            return -1;
        return min_dist;
    }
}