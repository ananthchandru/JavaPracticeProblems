package com.ananth.string.easy;

public class KeypadTyping {

    public static void main (String[] args) {
        String input = "amazon";
        System.out.println(input);
        System.out.println(getKeypadNos(input));
    }

    static String getKeypadNos(String str) {
        //works only with small letters
        int keyPadNums[] = {2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9};
        StringBuilder strBuilder = new StringBuilder();
        for(char ch: str.toCharArray())
            strBuilder.append(keyPadNums[ch -'a']);
         return strBuilder.toString();
    }
}
