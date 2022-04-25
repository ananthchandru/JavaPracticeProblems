package com.ananth.string.easy;

public class RemoveCharacter {

    static final int NO_OF_CHARS = 256;

    public static void main(String[] args){
        String input = "abcdefef";
        String delete = "ef";
        String output = removeDirtyChars(input, delete);
        String output2 = removeChars(input, delete);
        System.out.println(output2);
    }

    static String removeDirtyChars(String str, String mask_str) {
        int count[] = getCharCountArray(mask_str);
        int i = 0, j = 0;
        char input[] = str.toCharArray();

        while (i != input.length) {
            char ch = input[i];
            if (count[ch] == 0) {
                input[j] = ch;
                j++;
            }
            i++;
        }
        str = new String(input).substring(0, j);
        return str;
    }

    static int[] getCharCountArray(String str) {
        int count[] = new int[NO_OF_CHARS];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            count[ch]++;
        }
        return count;
    }

    static String removeChars(String string1, String string2){
        String finalStr = "";
        for(int i = 0 ; i < string1.length() ; i++) {
            if(!string2.contains(String.valueOf(string1.charAt(i))))
                finalStr = finalStr + string1.charAt(i);
        }
        return finalStr;
    }
}
