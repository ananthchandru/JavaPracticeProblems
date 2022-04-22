package com.ananth.arrays.easy;

class ReplaceZeroes {

    public static void main(String[] args) {
        int input = -990;
        int replaceWith = 5;
        ReplaceZeroes obj = new ReplaceZeroes();
        int output = obj.replaceZeroes(input, replaceWith);
        System.out.println(output);
    }

    public int replaceZeroes(int input, int replaceWith) {

        if(input == 0)
            return replaceWith;

        boolean isNegative = false;

        if(input < 0) {
            isNegative = true;
            input = input * -1;
        }

        int output = 0;
        int placeValue = 1;

        while(input > 0) {
            int modulus = (input % 10==0)? replaceWith:(input % 10);
            output += modulus * placeValue;
            input /= 10;
            placeValue *= 10;
        }
        return (isNegative ? -1 * output : output);
    }
}

/*
        Edge cases:
        i) Input is zero
        i) negative numbers
        ii) Floating numbers

Run
        1003 => 	output = 0, placeValue = 1
        while(1003 >0)
        modulus = 3; output = 0 + 3*1 =>
        output= 3; input  = 100; placeValue = 10;

        while(100 >0)
        modulus = 0; output = 3 + (5*10) =>
        output = 53; input = 10; placeValue = 100;

        while(10 > 0)
        modulus = 0; output = 53 + (5*100) =>
        output = 553; input = 1; placeValue = 1000;

        while(1 > 0)
        modulus = 1; output = 553 + (1*1000) =>
        output = 1553; input = 0; placeValue = 10000;
	*/
