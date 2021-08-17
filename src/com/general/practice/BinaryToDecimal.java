package com.general.practice;

//https://www.javatpoint.com/java-binary-to-decimal

public class BinaryToDecimal {

    //library logic
/*    public static void main(String args[]) {
        String binary = "1010";
        int decimal = Integer.parseInt(binary, 2);
        System.out.println(decimal);
    }*/

    //actual logic
    public static void main(String args[]) {
        int binary = 1011;
        int decimal = 0;
        int power = 0;

        while(binary > 0) {
            int temp = binary %2;
            decimal += temp * Math.pow(2,power);
            binary /= 10;
            power++;
        }
        System.out.println(decimal);
    }
}
