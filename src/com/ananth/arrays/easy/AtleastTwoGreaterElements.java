package com.ananth.arrays.easy;
import java.util.ArrayList;
import java.util.Arrays;

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
}