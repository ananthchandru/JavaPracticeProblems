package com.ananth.arrays.easy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

//Find all elements in array which have at-least two greater elements

class AtleastTwoGreaterElements {

    /*
     3 approaches are there
     O(N^2) Loop through every element and check if 2 numbers are greater than it
     O(NLog(N)) Sort and get all elements 2 less than arr size
     O(N) one iteration to get second highest, second iteration to get elements less than second iteration
     */
    public int[] getGreaterElements(int[] arr) {
        if(arr.length <= 2)
            return new int[]{};

        ArrayList<Integer> output = new ArrayList<Integer>();

        int highest = 0;
        int secondHighest = 0;

        for(int item:arr) {
            if(item > highest) {
                secondHighest = highest;
                highest = item;
            } else if(item > secondHighest  && item < highest)
                secondHighest = item;
        }

        for(int item:arr) {
            if(item < secondHighest)
                output.add(item);
        }
        return output.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] input = {8,4,2,1,7,9,3};
        AtleastTwoGreaterElements obj = new AtleastTwoGreaterElements();
        System.out.println(Arrays.toString(obj.getGreaterElements(input)));
    }

    /*Geeks For Geeks problem method - result needs to printed in assc order */
    public long[] findElements( long a[], long n)
    {
        int num = (int)n;
        long[] output = new long[num-2];
        PriorityQueue<Long> queue = new PriorityQueue<Long>(Collections.reverseOrder());
        for(int i=0;i<num-2;i++)
            queue.add(a[i]);

        for(int i=num-2;i<num;i++) {
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