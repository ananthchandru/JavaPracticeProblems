package com.ananth.arrays.easy;

public class RepetitiveAdditionOfDigits {

    public static void main(String[] args) {
        int num = 8888;
        System.out.println(getSumOfDigits(num));
    }

    public static int getSumOfDigits(int num) {

        while(num >=10) {
            int sum = 0;
            while(num >0 ) {
                sum += num%10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}
