package com.ananth.arrays.easy;

import java.util.Arrays;

public class ShuffleIntegers {
    // Driver Method
    public static void main(String[] args){
        int a[] = { 1, 3, 5, 7, 2, 4, 6, 8 };
//        shuffleArray1(a, a.length / 2);
        //shuffleArray2(a, 0, a.length-1);
        shuffleArray3(a);

        System.out.println(Arrays.toString(a));
    }
    //O(N^2) - not recommended
    static void shuffleArray1(int a[], int n){
        // Rotate the element to the left
        for (int i = 0, q = 1, k = n; i < n; i++, k++, q++)
            for (int j = k; j > i + q; j--) {
                // swap a[j-1], a[j]
                int temp = a[j - 1];
                a[j - 1] = a[j];
                a[j] = temp;
            }
    }

    //https://www.geeksforgeeks.org/shuffle-2n-integers-format-a1-b1-a2-b2-a3-b3-bn-without-using-extra-space/
    // O(NlogN) recursion Not recommended
    // method to shuffle an array of size 2n(other size of arrays won't work)
    static void shuffleArray2(int arr[], int low, int high) {
        //Return if low>high or only 2 elements are present
        if (low > high || (high-low==1))
            return;

        int mid = (low+high) / 2;

        // Used for swapping second half for first array
        int firstArrMid = (low + mid) / 2;
        // Used for swapping first half of second array
        int secondArrMid = mid + 1;

        // Swapping the element
        for (int i = firstArrMid + 1; i <= mid; i++) {
            // swap a[i], a[temp++]
            int temp = arr[i];
            arr[i] = arr[secondArrMid];
            arr[secondArrMid++] = temp;
        }

        // Recursively doing for first half and second half
        shuffleArray2(arr, low, mid);
        shuffleArray2(arr, mid + 1, high);
    }

    static void shuffleArray3(int arr[]) {
        // if size is null or odd return because it is not possible to rearrange
        if (arr == null || arr.length % 2 == 1)
            return;

        // start from the middle index
        int mid = (arr.length - 1) / 2;

        // each time we will set two elements from the
        // start to the valid position by swapping
        while (mid > 0) {
            int count = mid;
            int swapIdx = mid;

            while (count-- > 0) {
                int temp = arr[swapIdx + 1];
                arr[swapIdx + 1] = arr[swapIdx];
                arr[swapIdx] = temp;
                swapIdx++;
            }
            mid--;
        }
    }
}
