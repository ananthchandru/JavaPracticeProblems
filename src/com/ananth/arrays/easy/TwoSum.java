package com.ananth.arrays.easy;

import java.util.HashMap;
import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int[] array = {-1,-7,5,2,7,8};
        int target = 0;

        TwoSum obj = new TwoSum();
        int[] result = obj.getTwoSum(array, target);
        System.out.println(Arrays.toString(result));
    }
    // O(N logN)
    public int[] getTwoSum(int[] array, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<array.length; i++) {
            int num = target - array[i];
            if(map.containsKey(num)) {
                return new int[] {map.get(num), i};
            }
            map.put(array[i], i);
        }
        return new int[]{};
    }
    
    //O(N ^2)
/*    public int[] getTwoSum(int[] array, int target) {
        for(int i=0; i<array.length-1; i++) {
            for(int j=i+1; j<array.length; j++) {
                if(array[i] + array[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[]{};
    }*/
}