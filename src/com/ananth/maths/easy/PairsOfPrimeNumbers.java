package com.ananth.maths.easy;

import java.util.ArrayList;
import java.util.Arrays;

//To find pairs of prime numbers
// Get all prime numbers (using Sieve of Sundaram) < N/2
//generate list of permutation combination
public class PairsOfPrimeNumbers {

    public static void main(String[] args) {
        int n = 20;
        int[] result = getPairOfPrimeNumbers(n);
        System.out.println(Arrays.toString(result));
    }

    static int[] getPairOfPrimeNumbers(int N) {

        //Generate prime numbers using Sieve of Sundaram
        ArrayList<Integer> primeNos = getPrimeNumbers(N/2);
        ArrayList<Integer> result = new ArrayList<Integer>();

        for(int i=0;i<primeNos.size();i++) {
            for(int j=0;j<primeNos.size();j++) {
                if(primeNos.get(i)*primeNos.get(j) <= N) {
                    result.add(primeNos.get(i));
                    result.add(primeNos.get(j));
                }
            }
        }
        return result.stream().mapToInt(x->x).toArray();
    }

    static ArrayList<Integer> getPrimeNumbers(int N) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int mid = (N-1)/2;
        boolean[] arr = new boolean[mid+1];
        for(int i=1;i<=mid;i++) {
            for(int j=i;i+j+(2*i*j)<=mid;j++) {
                arr[i+j+(2*i*j)]= true;
            }
        }
        list.add(2);
        for(int i=1;i<=mid;i++) {
            if(!arr[i])
                list.add(2*i+1);
        }
        return list;
    }
}
