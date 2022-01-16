package com.ananth.arrays.easy;

public class MinimumDistance {

    public static void main(String[] args) {
        int[] arr = {0, 5, 6, 1, 4, 5, 5, 4, 6, 7};
        System.out.println(minDist1(arr, arr.length, 5, 6));
//        int[] arr = {1, 2, 3, 2};
//        System.out.println(minDist1(arr, arr.length, 1, 4));
    }
    //Longer code O(n)
    static int minDist(int arr[], int n, int x, int y) {
        int sub = -1, min_x = -1, min_y = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x)
                min_x = i;
            else if (arr[i] == y)
                min_y = i;

            if (min_x != -1 && min_y != -1) {
                if (sub == -1)
                    sub = min_y - min_x;
                else
                    Math.min(sub, (min_y - min_x));
            }
        }
        return sub;
    }
    //Shorter code O(n)
    static int minDist1(int arr[], int n, int x, int y) {

        //previous index and min distance
        int i = 0, p = -1, min_dist = Integer.MAX_VALUE;

        for (i = 0; i < n; i++) {
            if (arr[i] == x || arr[i] == y) {
                //we will check if p is not equal to -1 and
                //If the element at current index matches with
                //the element at index p , If yes then update
                //the minimum distance if needed
                if (p != -1 && arr[i] != arr[p])
                    min_dist = Math.min(min_dist, i - p);

                //update the previous index
                p = i;
            }
        }
        //If distance is equal to int max
        if (min_dist == Integer.MAX_VALUE)
            return -1;
        return min_dist;
    }
}