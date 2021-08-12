package com.ananth.string.easy;
import java.util.Arrays;

class CountCharacterType {

	public int[] countCharacterType(String s) {
		int[] output = new int[4];
		for(char c : s.toCharArray()) {
			if(c>=97 && c<=122)
				output[0]++;
			else if(c>=65 && c<=90)
				output[1]++;
			else if(c>=48 && c<=57)
				output[2]++;
			else output[3]++;
		}
		return output;
	}

	public static void main(String[] args) {
		String input = "234$%%(034aasdfSDNN*&*.";
		CountCharacterType ch = new CountCharacterType();
		int[] output = ch.countCharacterType(input);
		System.out.println(Arrays.toString(output));
	}
}

//Edge cases
//1. literally any input from keyboard is covered. So, not much edge case.