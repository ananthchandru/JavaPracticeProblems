package com.ananth.arrays.easy;

public class ThirdHighestElement {

    public static void main(String[] args) {
        int[] arr = {2,1,4,5,3};
        int thirdHighest = getThirdHighest(arr);
        System.out.println(thirdHighest);
        int thirdHighest1 = getThirdHighest1(arr);
        System.out.println(thirdHighest1);
    }

    // Array iterated 3 times O(N) + O(1) no auxiliary space
    static int getThirdHighest(int[] arr) {

        if(arr.length < 3)
            return -1;

        //first highest
        int first = arr[0];
        for(int i=1; i<arr.length;i++) {
            if(arr[i] > first)
                first = arr[i];
        }
        //second highest
        int second = Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++) {
            if(arr[i] > second && arr[i] < first)
                second = arr[i];
        }
        //third highest
        int third = Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++) {
            if(arr[i] > third && arr[i] < second)
                third = arr[i];
        }
        return third;
    }

    static int getThirdHighest1(int arr[]) {
        if (arr.length < 3)
            return -1;

        int first = arr[0], second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;

        // Traverse array elements to find the third Largest
        for (int i = 1; i < arr.length; i++) {
            /* If current element is greater than first,
        then update first, second and third */
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } /* If arr[i] is in between first and second */ else if (arr[i] > second) {
                third = second;
                second = arr[i];
            } /* If arr[i] is in between second and third */ else if (arr[i] > third) {
                third = arr[i];
            }
        }
        return third;
    }
}
