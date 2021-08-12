package com.ananth.arrays.easy;

import java.util.Arrays;

class HighestLowest {

    public static void main(String[] args) {
        int[] arr = {5,2,7,8,34};
        HighestLowest obj = new HighestLowest();
        System.out.println(Arrays.toString(obj.findHighestLowest(arr)));
    }

    public int[] findHighestLowest(int[] arr) {
        int[] outputArray = new int[]{arr[0], arr[0]};

        for(int i: arr) {
            if(i < outputArray[0])
                outputArray[0] = i;
            if(i > outputArray[1])
                outputArray[1] = i;
        }
        return outputArray;
    }
}