package com.general.practice;

//https://www.javatpoint.com/java-binary-to-decimal

import java.util.Arrays;

public class DecimalToBinary {

    //library logic
/*    public static void main(String args[]) {
        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toBinaryString(21));
        System.out.println(Integer.toBinaryString(31));
    }*/

    //actual logic
    public static void main(String args[]) {

        int decimal = 11;
        int[] binary = new int[40];
        int index = 0;

        while(decimal > 0){
            binary[index] = decimal%2;
            decimal = decimal/2;
            index++;
        }

        String str = "";
        for(int i = index-1; i>=0; i--)
            str+=Integer.toString(binary[i]);

        System.out.println(str);
    }
}
