package com.ananth.string.easy;

public class CheckForSubsequence {

    public static void main(String[] args) {
        System.out.println(isSubSequence("bdg", "abcdefg"));
        System.out.println(isSubSequence("dgb", "abcdefg"));
        System.out.println(isSubSequence("bdg", "abcedbcedfg"));
    }

    static boolean isSubSequence(String A, String B) {
        boolean isSubSeq = false;
        int strLength = B.length();
        int substrLength = A.length();
        int i=0,j=0;
        while(i<strLength && j<substrLength) {
            if(B.charAt(i)==A.charAt(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if(j==substrLength)
            isSubSeq = true;
        else if(i==strLength && j!=substrLength)
            isSubSeq = false;

        return isSubSeq;
    }
}
