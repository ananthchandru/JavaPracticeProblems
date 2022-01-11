package com.ananth.arrays.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

//https://leetcode.com/problems/kth-largest-element-in-an-array/discuss/60294/Solution-explained
//https://www.geeksforgeeks.org/k-largestor-smallest-elements-in-an-array/

class KLargestElements {

/*      i) O(n*log(n)) + O(1) memory
            (O(k) if you want it sorted or need Kth element)
            Arrays.sort, get k numbers => O(n*log(n)) + O(1) memory

            public int findKthLargest(int[] nums, int k) {
                final int N = nums.length;
                Arrays.sort(nums);
                return nums[N - k];
            }

       ii) Min/Max Heap
            O(N lg K) running time + O(K) memory
            Min/Max Heap priority queue (store k elements in heap)
            O(N) is for building heap
            O(log N) is for heapify
            O(K) is for taking out k elements

       iii) Quick select => O(N) (worst case O(N^2) which is rare)
     */


    public static void main(String[] args) {
        int[] input = {2, 5, 3, 1, 6, 4};
        int k = 3;
        ArrayList<Integer> outputMin = getKLargestElementsMinHeap(input, k);
        ArrayList<Integer> outputMax = getKLargestElementsMaxHeap(input, k);
        System.out.println(outputMin.toString());
        System.out.println(outputMax.toString());
    }

    public static ArrayList<Integer> getKLargestElementsMaxHeap(int[] arr, int k) {
        ArrayList<Integer> kLargeElements = new ArrayList<Integer>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());

        for (int item : arr)
            maxHeap.add(item);

        for (int i = 0; i < k; i++)
            kLargeElements.add(maxHeap.poll());

        return kLargeElements;
    }

    public static ArrayList<Integer> getKLargestElementsMinHeap(int[] arr, int k) {
        ArrayList<Integer> kLargeElements = new ArrayList<Integer>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < k; i++)
            minHeap.add(arr[i]);

        for (int i = k; i < arr.length; i++) {
            if (arr[i] > minHeap.peek()) {
                minHeap.poll();
                minHeap.add(arr[i]);
            }
        }
        //For Kth largest => return minHeap.poll()

        for (int i = 0; i < k; i++)
            kLargeElements.add(minHeap.poll());

        return kLargeElements;
    }

}