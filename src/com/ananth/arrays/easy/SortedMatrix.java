package com.ananth.arrays.easy;

import java.util.Arrays;

// Important to note that if matrix is of size n*n, we can iterate for loops with i<n, j<n
// Else it has to be i<arr.length for i loop, j < arr[0].length for the inner j loop

public class SortedMatrix {

    public static void main(String[] args) {
        int [][] input = {{ 5, 12, 17, 21, 23},
                            { 1,  2,  4,  6,  8},
                            {12, 14, 18, 19, 27},
                            { 3,  7,  9, 15, 25}
                        };

        printMatrix(input);
        printMatrix(sortMatrix(input));
    }

    static int[][] sortMatrix(int[][] arr) {
        int[] temp = new int[arr.length*arr[0].length];
        int k=0;
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++) {
                temp[k] = arr[i][j];
                k++;
            }
        }
        Arrays.sort(temp);
        int l=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = temp[l];
                l++;
            }
        }
        return arr;
    }

    static void printMatrix(int[][] arr) {
        System.out.println();
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
