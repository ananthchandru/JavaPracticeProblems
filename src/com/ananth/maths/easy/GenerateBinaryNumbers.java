package com.ananth.maths.easy;

import java.util.ArrayList;

public class GenerateBinaryNumbers {

    public static void main(String[] args) {
        int n = 5;
        long binaryNos = new GenerateBinaryNumbers().generateBinaryNos(5);
        System.out.println(String.valueOf(binaryNos));
    }

    //using library
//    public ArrayList<String> generateBinaryNos(int n) {
//        ArrayList<String> binaryNos = new ArrayList<String>();
//        for(int i=1; i<=n; i++) {
//            binaryNos.add(Integer.toBinaryString(i));
//        }
//        return binaryNos;
//    }

    //exact logic
    public long generateBinaryNos(int n) {

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

        return binaryNumber;
    }

    /*   exact logic
    //  public ArrayList<String> generateBinaryNos(int n) {
        ArrayList<String> binaryNos = new ArrayList<String>();
        for(int i=1; i<=n; i++) {
            binaryNos.add(getBinaryNumber(i));
        }
        return binaryNos;
    }

    public String getBinaryNumber(int decimal) {
        int[] binary= new int[40];
        int index = 0;

        while(decimal >0) {
            binary[index] = decimal % 2;
            decimal /= 2;
            index++;
        }

        StringBuffer strBuffer = new StringBuffer();
        for(int i = index-1; i>=0; i--)
            strBuffer.append(Integer.toString(binary[i]));

        return strBuffer.toString();
    }*/
}

