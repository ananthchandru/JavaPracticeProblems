package ds.arrays;

public class Replace0With5 {
	
	public static void main(String[] args) {
		int num = -1006;
		//int convertedNumber = num + replaceDigits(num);
		System.out.println(replaceDigits(num));
	}
	
	public static int replaceDigits(int num) {
		
		int orignalNum = num;
		
		boolean ifNegative = false;
		if(num < 0) {
			ifNegative = true;
		}
		
		num = ifNegative ? (-1 * num) : num;
		
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
		return orignalNum + (ifNegative ? (-1 * result) : result);
	}
}

//corner cases
// 1. Input datatype is int/float/long/double
// 2. Input is Negative number => -1006
// 3. Input is Zero => return 5