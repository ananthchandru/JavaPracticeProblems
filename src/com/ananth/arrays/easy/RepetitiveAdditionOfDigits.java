package com.ananth.arrays.easy;

public class RepetitiveAdditionOfDigits {

    public static void main(String[] args) {
        int num = 98949834;
        System.out.println(getSumOfDigits(num));
        System.out.println(singleDigit1(num));
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

    //Formula

    static int singleDigit1(int N){
        return 1+(N-1)%9;
    }

    // Recursion
    static int singleDigit2(long N){
        int digit = 0;
        while(N>0) {
            digit += N%10;
            N/=10;
        }
        if(digit>9) {
            return singleDigit1(digit);
        }
        return digit;
    }
}
