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
    public static void main (String args[]) {

        int n = 5;

        long binaryNumber = 0;
        int remainder;
        int placeValue = 1;
        int step = 1;

        while (n != 0) {
            remainder = n % 2;
            System.out.println("Step " + step++ + ": " + n + "/2");

            System.out.println("Quotient = " + n / 2 + ", Remainder = " + remainder);
            n /= 2;

            binaryNumber += remainder * placeValue;
            placeValue *= 10;
        }

        System.out.println(binaryNumber);
    }
}
