package com.ananth.arrays.easy;

import java.util.*;

public class SubstringFirstAndLastCharacter {

    public static void main(String[] args) {
        String input = "abcab";
        System.out.println(getSubstringCount(input));
    }

    static int getSubstringCount(String str) {
        int substringCount = 0;
        int[] count = new int[str.length()];
        for(char ch: str.toCharArray()) {
            count[Integer.valueOf(ch)]++;
        }
        for(int c: count) {
            substringCount+=c;
        }
        return substringCount;
    }
}
