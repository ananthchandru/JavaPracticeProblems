package com.ananth.arrays.easy;

public class Replace0With5Recursion {
	
	  public static void main(String[] args)
	    {
	        System.out.println(convert0To5(1003));
	    }
	  
	  static int convert0To5Rec(int num)
	    {
	        // Base case
	        if (num == 0)
	            return 0;
	 
	        // Extraxt the last digit and change it if needed
	        int digit = num % 10;
	        if (digit == 0)
	            digit = 5;
	 
	        // Convert remaining digits and append the
	        // last digit
	        
	        System.out.println(num / 10);
	        return convert0To5Rec(num / 10) * 10 + digit;
	    }
	 
	    // It handles 0 and calls convert0To5Rec() for
	    // other numbers
	    static int convert0To5(int num)
	    {
	        if (num == 0)
	            return 5;
	        else
	            return convert0To5Rec(num);
	    }

}
