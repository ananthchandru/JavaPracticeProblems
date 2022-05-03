package com.ananth.arrays.easy;

import java.util.Arrays;
import java.util.HashSet;

/*Geeks for Geeks asks to print in ascending order (N*O(Log N))
*   but expects this to be done in in O(N)
* */

public class MakeDistinctDigitArray {

    public static void main(String[] args) {
        int[] arr = {131, 11, 48};
        int[] result = common_digits(arr);
        System.out.println(Arrays.toString(result));
    }

    static int[] common_digits(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++) {
            while(nums[i] > 0) {
                set.add(nums[i]%10);
                nums[i] /=10;
            }
        }
        int[] arr = set.stream().mapToInt(Number::intValue).toArray();
        return arr;
    }
}
