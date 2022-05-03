package com.ananth.string.easy;

public class BinaryString {
    public static void main(String[] args) {
        String input = "11111";
        int res = countSubString(input.toCharArray(), input.length());
 //     int res = countSubString2(input);
        System.out.println(res);
    }

    //O(N) => count no.of 1s and apply formula N(N-1)/2
    static int countSubString(char[] arr, int n) {
        int res = 0;
        for(int i=0; i<n;i++) {
            if(arr[i]=='1')
                res++;
        }
        return (res*(res-1))/2;
    }

/*    //O(N^2) => 2 loops, 1 for starting point, another for ending point
    static int countSubString(char[] arr, int n) {
        int res = 0;
        for(int i=0; i<n;i++) {
            if(arr[i] =='1')
                for(int j=i+1;j<n;j++)
                    if(arr[j]=='1')
                        res++;
        }
        return res;
    }*/
}
