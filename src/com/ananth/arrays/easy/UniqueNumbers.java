package com.ananth.arrays.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UniqueNumbers {
    //Print digits with only unique numbers => when L = 110, R = 135, we ignore 111,121,122,131,133
    public static void main(String[] args) {
        ArrayList<Integer> list = uniqueNumbers1(23,362);
        System.out.println(list.toString());
    }

    static ArrayList<Integer> uniqueNumbers1(int L, int R){
        ArrayList<Integer> uniqueNos = new ArrayList<Integer>();
        for(int i=L; i<=R; i++) {
            boolean[] visited = new boolean[10];
            int j = i;
            while (j != 0) {
                if(visited[j%10])
                    break;
                visited[j%10] = true;
                j /=10;
            }
            if (j ==0)
                uniqueNos.add(i);
        }
        return uniqueNos;
    }

    static ArrayList<Integer> uniqueNumbers2(int L, int R){
        ArrayList<Integer> uniqueNos = new ArrayList<Integer>();
        for(int i=L; i<=R; i++) {
            Set<Integer> nos = new HashSet<Integer>();
            int count = 0;
            int j = i;
            while (j != 0) {
                nos.add(j % 10);
                j /= 10;
                count++;
            }
            if (count == nos.size())
                uniqueNos.add(i);
        }
        return uniqueNos;
    }


    static ArrayList<Integer> uniqueNumbers3(int L, int R) {
        ArrayList<Integer> uniqueNos = new ArrayList<Integer>();
        // Iterate from l to r
        for(int i = L; i <= R; i++) {
            String str = String.valueOf(i);
            // Convert String to set using stl
            HashSet<Integer> digits = new HashSet<Integer>();
            for (int c : str.toCharArray())
                digits.add(c);

            if (str.length() == digits.size())
                uniqueNos.add(i);
        }
        return uniqueNos;
    }

}
