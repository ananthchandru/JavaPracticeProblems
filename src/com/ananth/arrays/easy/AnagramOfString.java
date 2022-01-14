package com.ananth.arrays.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class AnagramOfString {

    public static void main(String[] args) {
        String s = "baseline"; //only small letters for now
        String s1 = "base";
        System.out.println(areAnagram1(s1.toCharArray(), s.toCharArray()));
        System.out.println(areAnagram(s1.toCharArray(), s.toCharArray()));
        System.out.println(isAnagram(s1, s));
    }

/*
    Approach 1: O(NLogN) - Sort both strings and compare (not recommended)
    Approach 2 O(N) - use an array (better)
    Approach 3: O(N) - use hashmap
*/
    static boolean areAnagram(char[] str1, char[] str2)
    {
        if (str1.length != str2.length)
            return false;

        // Sort both strings
        Arrays.sort(str1);
        Arrays.sort(str2);

        // Compare sorted strings
        for (int i = 0; i < str1.length; i++)
            if (str1[i] != str2[i])
                return false;

        return true;
    }

    static boolean areAnagram1(char str1[], char str2[])
    {
        if (str1.length != str2.length)
            return false;

        int NO_OF_CHARS = 256;
        int count[] = new int[NO_OF_CHARS];

        for (int i = 0; i < str1.length;i++) {
            count[str1[i] - 'a']++;
            count[str2[i] - 'a']--;
        }

        // Compare count arrays
        for (int i = 0; i < NO_OF_CHARS; i++)
            if (count[i] != 0)
                return false;

        return true;
    }

    public static boolean isAnagram(String a, String b)    {
        // Check if length of both strings is same or not
        if (a.length() != b.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            if (map.containsKey(a.charAt(i)))
                map.put(a.charAt(i), map.get(a.charAt(i)) + 1);
            else
                map.put(a.charAt(i), 1);
        }

        for (int i = 0; i < b.length(); i++) {
            if (map.containsKey(b.charAt(i))) {
                map.put(b.charAt(i),
                        map.get(b.charAt(i)) - 1);
            }
        }

        Set<Character> keys = map.keySet();

        for (Character key : keys) {
            if (map.get(key) != 0) {
                return false;
            }
        }

        return true;
    }

}
