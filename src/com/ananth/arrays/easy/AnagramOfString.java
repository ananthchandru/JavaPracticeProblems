package com.ananth.arrays.easy;

public class AnagramOfString {
    public static void main(String[] args) {
        String s = "baseline"; //only small letters for now
        String s1 = "base";
        System.out.println(remAnagrams(s1, s));
    }
    static int remAnagrams(String s, String s1) {
        int[] charArr =  new int[26];
        int counter = 0;

        for(int i=0; i<s.length(); i++)
            charArr[s.charAt(i)-'a']++;

        for(int j=0; j<s1.length(); j++)
            charArr[s1.charAt(j)-'a']--;

        for(int k=0;k<26;k++)
            counter += Math.abs(charArr[k]);

        return counter;
    }
}
