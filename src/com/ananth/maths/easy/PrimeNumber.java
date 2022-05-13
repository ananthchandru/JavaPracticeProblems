
package com.ananth.maths.easy;

class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(0)); 
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(8));
        System.out.println(isPrime(20));
        System.out.println(isPrime(97));
    }
    
    static int isPrime(int N){
        if(N<=1) {
            return 0;
        } else if(N==2) {
            return 1;
        } else if(N%2==0) {
            return 0;
        }

        for(int i =3;i<=Math.sqrt(N);i+=2) {
            if(N%i==0) {
                return 0;
            }
        }
        return 1;
    }
}
