package com.ananth.string.easy;

public class FirstLetterOfWordInString {

    public static void main(String[] args) {
        String input = "How do you do";
        System.out.println(getFirstLetter(input));
    }

    static String getFirstLetter(String inputString)
    {
        StringBuffer strBufffer = new StringBuffer();
        String arr[] = inputString.split(" ");
        for(String str:arr)
            strBufffer.append(str.charAt(0));
        return strBufffer.toString();
    }

/*   static String getFirstLetter(String inputString)
    {
        StringBuilder str = new StringBuilder();
        str.append(inputString.charAt(0));
        for(int i = 0; i < S.length(); i++){
            if(inputString.charAt(i) == ' '){
                str.append(inputString.charAt(i+1));
            }
        }
        return str.toString();
    }*/
}
