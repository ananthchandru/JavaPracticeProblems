package com.ananth.arrays.easy;

import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Arrays;

class Test {
    public static void main(String[] args) {
        long[] arr = {-1,7,4,3,2,6,-2};
        long[] output = findElements(arr, arr.length);
        System.out.println(Arrays.toString(output));
    }
    public static long[] findElements(long a[], int n) {
        long[] output = new long[n-2];
        PriorityQueue<Long> queue = new PriorityQueue<Long>(Collections.reverseOrder());
        for(int i=0;i<n-2;i++)
            queue.add(a[i]);

        for(int i=n-2;i<n;i++) {
            long peek = queue.peek();
            if(peek > a[i]) {
                queue.poll();
                queue.add(a[i]);
            }
        }
        int j=output.length-1;
        while(!queue.isEmpty()) {
            output[j] = queue.poll();
            j--;
        }
        return output;
    }
}