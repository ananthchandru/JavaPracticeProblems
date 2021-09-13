package com.ananth.arrays.easy;

public class FirstOccOfSubstring {

    public static void main(String[] args) {
        String str = "GeeksForGeeks";
        String substr = "orG";
        System.out.println(findFirstOcc(str, substr));
    }

    // plain and Simple using library
/*    static int findFirstOcc(String str, String substr) {
        return str.indexOf(substr);
    }*/

    // Without lib
    static int findFirstOcc(String s, String x) {
        if(s.length() < x.length())
            return -1;

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)==x.charAt(0)) {
                int counter = 1;
                for(int j=1, k=i+1; j<x.length() && k<s.length(); j++,k++) {
                    if(x.charAt(j) == s.charAt(k))
                        counter++;
                }
                if(counter == x.length())
                    return i;
            }
        }
        return -1;
    }

    //Function to locate the occurrence of the string x in the string s.
    /*static int findFirstOcc3(String s, String x) {
        int n = s.length();
        int m = x.length();

        for(int i=0;i<=n-m;i++){
            if(s.substring(i,i+m).equals(x)){
                return i;
            }
        }
        return -1;
    }*/
}
