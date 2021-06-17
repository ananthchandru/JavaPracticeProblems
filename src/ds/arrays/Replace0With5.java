package ds.arrays;

public class Replace0With5 {
	
	public static void main(String[] args) {
		int num = -5;
		boolean ifNegative = false;
		if(num < 0) {
			ifNegative = true;
		}
		int convertedNumber = num + replaceDigits(num, ifNegative);
		System.out.println((convertedNumber));
	}
	
	public static int replaceDigits(int num, boolean negative) {
		
		num = negative ? (-1 * num) : num;
		
		int result = 0;
		int decimal = 1;
		
		if(num == 0) {
			return 5;
		}
		
		while(num > 0) {
			if(num%10 == 0) {
				result = result + (5 * decimal);
			}
			decimal *= 10;
			num /= 10;
		}
		return negative ? (-1 * result) : result;
	}
}

//corner cases
// 1. Input datatype is int/float/long/double
// 2. Input is Negative number => -1006
// 3. Input is Zero => return 5