package com.ananth.arrays.easy;

// Java program to find minimum number of
// characters to be removed to make two
// strings anagram.

import java.util.*;



public class AnagramOfString {

    public static void main(String[] args) {
        String str1 = "baseline"; //only small letters for now
        String str2 = "base";
        System.out.println(minCharsToRemove(str1, str2));
    }

    static int minCharsToRemove(String str1, String str2) {
        int[] arr = new int[256];

        for(int i=0; i<str1.length(); i++)
            arr[str1.charAt(i)-'a']++;

        for(int i=0; i<str2.length(); i++)
            arr[str1.charAt(i)-'a']--;

        int result = 0;
        for(int i=0;i<256;i++)
            result += Math.abs(arr[i]);
        return result;
    }


}
