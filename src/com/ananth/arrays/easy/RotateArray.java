package com.ananth.arrays.easy;

class RotateArray {

    /*
    i) O(N*d) + O(1) - Rotate one by one - if you move array d times and add first element to the last place
    ii) O(N) + O(d) space - Store d position in temp array, move remaining elements in one shot and fill
     space with temp array
    ii) O(N) + (1) space -
        Reversal Algorithm
        Juggling Algorithm (GCD) => GCD = (A*B)/LCM(A,B)
        LCM =>https://www.cuemath.com/numbers/lcm-least-common-multiple/

        Block swap Algorithm
    */
    public static void main(String[] args) {
        String input = "ENDURE";
        String output = rotateOneByOne(input, 4);
        String output1 = rotateOnceUsingTemp(input, 4);
        System.out.println(input + "\n" + output1);
        String output2 = rotateArrayJuggling(input.toCharArray(), 4);
        System.out.println(input + "\n" + output2);
        String output3 = rotateArrayReverse(input.toCharArray(), 4);
        System.out.println(input + "\n" + output3);
    }

    static String rotateOneByOne(String input, int position) {
        char[] chArr = input.toCharArray();
        int length = chArr.length;

        int move = length%position;

        while(move > 0) {
            char temp = chArr[0];
            for(int i=0;i<length-1;i++)
                chArr[i] = chArr[i+1];
            chArr[length-1] = temp;
            move--;
            System.out.println(String.valueOf(chArr));
        }
        return String.valueOf(chArr);
    }

    static String rotateOnceUsingTemp(String input, int position) {
        char[] chArr = input.toCharArray();
        int length = chArr.length;
        int modPosition = length%position;

        char[] temp = new char[modPosition];

        for(int i=0;i<modPosition;i++)
            temp[i] = chArr[i];

        for(int i=modPosition; i<length;i++)
            chArr[i-modPosition] = chArr[i];

        for(int i=0;i<modPosition;i++)
            chArr[i+position] = temp[i];

        return String.valueOf(chArr);
    }


    static String rotateArrayJuggling(char[] arr, int position) {
        int n = arr.length;
        int d = position % n;
        int gcd = findGCD(position, n);
        int i,j,k;
        char temp;
        for(i=0;i<gcd;i++) {
            temp = arr[i];
            j=i;
            while(true) {
                k = j + d;
                if (k >= n)
                    k = k - n;
                if (k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
        return String.valueOf(arr);
    }

    static int findGCD(int a, int b) {
        if(b==0)
            return a;
        return findGCD(b, a%b);
    }

    static String rotateArrayReverse(char[] arr, int position) {
        int n = arr.length;
        position = position % n;
        reverse(arr, 0, position-1); //reverse entire array  ("ERUDNE")
        reverse(arr, position, n-1); //reverse first k elements ("DURENE")
        reverse(arr, 0, n-1);// reverse remaining elements ("DUREEN")

        return String.valueOf(arr);
    }

    static void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
