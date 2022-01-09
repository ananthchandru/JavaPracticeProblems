package com.ananth.arrays.easy;

public class ConvertToRoman {

    public static void main(String[] args ) {
        int input = 2579;
        int[] a = {0};
        System.out.println(a);
        System.out.println(convertToRoman(input));
    }

    static String convertToRoman(int num) {
        if(num<1 || num >3999) throw new IllegalArgumentException();
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV","I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        int i= 0;

        StringBuilder str = new StringBuilder();
        while(num > 0) {
            if(num - values[i] >= 0) {
                str.append(roman[i]);
                num -= values[i];
            } else i++;
        }
        return str.toString();
    }

    /*static String convertToRoman(int num) {
        String m[] = { "", "M", "MM", "MMM" };
        String c[] = { "",  "C",  "CC",  "CCC",  "CD",
                "D", "DC", "DCC", "DCCC", "CM" };
        String x[] = { "",  "X",  "XX",  "XXX",  "XL",
                "L", "LX", "LXX", "LXXX", "XC" };
        String i[] = { "",  "I",  "II",  "III",  "IV",
                "V", "VI", "VII", "VIII", "IX" };

        // Converting to roman
        String thousands = m[num / 1000];
        String hundereds = c[(num % 1000) / 100];
        String tens = x[(num % 100) / 10];
        String ones = i[num % 10];

        String ans = thousands + hundereds + tens + ones;

        return ans;
    }*/
}
