package com.ananth.string.easy;

public class RemoveCharacter {

    static final int NO_OF_CHARS = 256;

    public static void main(String[] args){
        String input = "abcdefef";
        String delete = "ef";
        String output = removeDirtyChars(input, delete);
        System.out.println(output);
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
}
