package com.ananth.arrays.easy;

class ReplaceZeroesRecursion {

    int replaceWith = 5;

    public static void main(String[] args) {
        int input = 100;
        ReplaceZeroesRecursion obj = new ReplaceZeroesRecursion();
        int output = obj.replaceZeroes(input);
        System.out.println(output);
    }

    public int replaceZeroes(int input) {
        if(input == 0)
            return replaceWith;
        if(input < 0)
            return -1 * replaceZeroesRecursive(input * -1);
		else
            return replaceZeroesRecursive(input);
    }

    public int replaceZeroesRecursive(int input) {
        if(input == 0)
            return 0;

        int modulusSum = input % 10;

        if(modulusSum == 0)
            modulusSum = replaceWith;

        return replaceZeroesRecursive(input/10)*10 + modulusSum;
    }
}

/*
        Edge cases:
        i) Input is zero
        i) negative numbers
        ii) Floating numbers

        Recursion
        i) Stop condition - return 0 when input becomes 0
        ii) Function will return modulus (input % 10)
            (if modulus is 0, return 5)
        iii) function output * 10 for place value handling during each recursive call
        iv) Add modulus to function output


 */