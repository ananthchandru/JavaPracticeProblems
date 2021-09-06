package com.ananth.arrays.easy;

import java.util.Arrays;

public class MinimumDifferencePair {

    public static void main(String[] args) {
        int[] nums = {18, 9, 3};
        int diff = minimum_difference(nums);
        System.out.println(diff);
    }

    static int minimum_difference(int[] nums) {
        int diff = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++) {
            if(diff > (nums[i+1] - nums[i]))
                diff = nums[i+1] - nums[i];
        }
        return diff;
    }

    //Brute force => O(n^2)
    /*static int minimum_difference(int[] nums)
    {
        int min = Integer.MAX_VALUE;
        int length = nums.length;
        for(int i=0; i<length-1; i++) {
            for(int j=i+1; j<length; j++){
                int temp = nums[j] > nums[i] ? (nums[j] - nums[i]) : (nums[i] - nums[j]);
                if(min > temp)
                    min = temp;
            }
        }
        return min;
    }*/


}
