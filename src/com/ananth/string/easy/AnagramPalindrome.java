package com.ananth.string.easy;

public class AnagramPalindrome {

    public static void main(String[] args) {
        System.out.println(isPossible("geeksooogeeks"));
        System.out.println(isPossible("geeksforgeeks"));
    }

    static int isPossible (String S)
    {
        int[] count = new int[256];
        int counter=0;
        for(int i=0;i<S.length();i++) {
            count[S.charAt(i)]++;
        }
        for(int i=0;i<256;i++) {
            if(count[i]%2==1) {
                counter++;
                if(counter > 1) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
