package com.ananth.bitmagic.easy;

/* check whether every bit in the binary representation of the given number is set or not.
        Input : 7
        Output : Yes
        (7)10 = (111)2
*/

public class CheckSetBits {

    public static void main (String[] args) {
        int input = 63;
        System.out.println(Integer.bitCount(input));
        if(isBitSet(input)==1)
            System.out.println("All bits set");
        else
            System.out.println("All bits not set");

    //    System.out.println(isBitSet2(input));
    }

    /* ‘&’ : - is a Bitwise AND Operator. It produces a one (1) in the output if both the input bits are one.
    Otherwise it produces zero (0).

    int a=12; (binary 1100)
    int b=6; (binary 0110)
    int c=(a & b); (binary 0100)
    The value of c is 4.

*/
    static int isBitSet(int n) {
        if(n!=0 && (n & n+1)==0) //input 63 => 111111, 64 =? 100000
            return 1;
        return 0;
    }

    //One More approach
    static int isBitSet2(int n) {
        if(n!=0 && (Math.pow(2, Integer.bitCount(n)) -1)==n)
            return 1;
        return 0;
    }
}
