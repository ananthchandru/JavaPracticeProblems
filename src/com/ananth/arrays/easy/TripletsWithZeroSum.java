package com.ananth.arrays.easy;

/*
Input : arr[] = {0, -1, 2, -3, 1}
Output : (0 -1 1), (2 -3 1)
*/

// Worst Approach: O(N^3) + O(1) space => run 3 loops and check
// Better Approach: O(N^2) + O(N) space => hashing
// Best Approach: O(N^2) + O(1) space => sorting

import java.util.Arrays;
import java.util.HashSet;

public class TripletsWithZeroSum {

    public static void main(String[] args) {
//        int arr[] = {0, -1, 2, -3, 5};
        int arr[] = {0, -1, 2, -3, 1};
//        findTriplets1(arr);
//        findTriplets2(arr);
        findTriplets3(arr);
    }

    // Worst Approach: O(N^3) + O(1) space => run 3 loops and check
    static void findTriplets1(int[] arr) {
        int n = arr.length;
        boolean found = false;
        for(int i=0; i<n-2;i++) {
            for(int j=i+1; j<n-1;j++) {
                for(int k=j+1; k<n;k++) {
                    if(arr[i]+arr[j]+arr[k]==0){
                        System.out.println(arr[i] + "," + arr[j]+ "," + arr[k]);
                        found = true;
                    }
                }
            }
        }
        if(!found)
            System.out.println("Not found");
    }

    // Better Approach: O(N^2) + O(N) space => hashing
    static void findTriplets2(int[] arr) {
        int n = arr.length;
        boolean found = false;
        for(int i=0; i<n-1;i++) {
            HashSet<Integer> set = new HashSet<Integer>();
            for(int j=i+1; j<n;j++) {
                int sum = arr[i] + arr[j];
                int minusSum = -1 * sum;
                if(set.contains(minusSum)) {
                    System.out.println(arr[i] + "," + arr[j]+ "," + minusSum);
                    found = true;
                } else
                    set.add(arr[j]);
            }
        }
        if(!found)
            System.out.println("Not found");
    }

    // Best Approach: O(N^2) + O(1) space => sorting
    static void findTriplets3(int[] arr) {
        int n = arr.length;
        boolean found = false;
        Arrays.sort(arr);
        for(int i=0; i<n-1;i++) {
            int l = i + 1;
            int r = n - 1;
            int x = arr[i];
            while (l < r) {
                if (x + arr[l] + arr[r] == 0) {
                    // print elements if it's sum is zero
                    System.out.print(x + " ");
                    System.out.print(arr[l]+ " ");
                    System.out.println(arr[r]+ " ");

                    l++;
                    r--;
                    found = true;
                } else if (x + arr[l] + arr[r] < 0)
                    l++;
                else
                    r--;
            }
        }
        if(!found)
            System.out.println("Not found");
    }
}
