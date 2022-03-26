package com.ananth.arrays.easy;

import java.util.*;

public class SubstringFirstAndLastCharacter {

    public static void main(String[] args) {
        String input = "abcab";
    }

    static void getSubstringCount(String str) {
        int[] count = new int[str.length()];
        for(char ch: str.toCharArray()) {
            count[Integer.valueOf(ch)]++;
        }
    }
}
