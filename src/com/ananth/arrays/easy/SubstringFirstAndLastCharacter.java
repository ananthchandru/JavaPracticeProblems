package com.ananth.arrays.easy;

import java.util.*;

public class SubstringFirstAndLastCharacter {

    public static void main(String[] args) {
        String input = "abcab";
        System.out.println(getSubstringCount(input));
    }

    static int getSubstringCount(String str) {
        int[] count = new int[256];
        int result = 0;
        for(int i=0;i<str.length();i++) {
            count[str.charAt(i)]++;
        }
        for(int i=0;i<count.length;i++) {
            result += count[i]*(count[i]+1)/2;
        }
        return result;
    }
}
