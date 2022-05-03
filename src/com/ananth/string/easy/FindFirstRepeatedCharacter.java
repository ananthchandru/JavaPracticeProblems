package com.ananth.string.easy;

import java.util.HashSet;

public class FindFirstRepeatedCharacter {

    public static void main(String[] args) {
        String input = "geeksFor";
        System.out.println(firstRepChar(input));
    }

    static String firstRepChar(String s) {
        HashSet<Character> set = new HashSet<Character>();
        for(char ch : s.toCharArray()) {
            if(set.contains(ch))
                return String.valueOf(ch);
            else
                set.add(ch);
        }
        return String.valueOf(-1);
    }
}
