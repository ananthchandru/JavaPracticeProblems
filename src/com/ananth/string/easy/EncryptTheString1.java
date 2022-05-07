package com.ananth.string.easy;

public class EncryptTheString1 {

    public static void main(String[] args) {
        System.out.println(encryptString("aaaaa"));
        System.out.println(encryptString("dgb"));
        System.out.println(encryptString("dskfjdsfjsfklhjgfrehitaaaaaaaakjhkdhsjhfehfeeuuuuuuuuuuuuoetiroitoritttttttttttttttdfnbsfdhs"));
    }

    static String encryptString(String s)
    {
        StringBuilder strBuild = new StringBuilder();
        int n = s.length();
        char prevString = s.charAt(0);
        int counter = 1;
        for(int i=1;i<n;i++) {
            if(s.charAt(i)==prevString) {
                counter++;
            } else {
                strBuild.append(prevString);
                strBuild.append(String.valueOf(counter));
                prevString = s.charAt(i);
                counter = 1;
            }
        }
        strBuild.append(prevString);
        strBuild.append(String.valueOf(counter));
        return strBuild.reverse().toString();
    }
}
