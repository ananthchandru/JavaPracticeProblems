package com.ananth.arrays.easy;

public class NumberOfOccurences {

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,2,2,3,3,4,4,6,7,8};
  //      System.out.println(count3(arr, arr.length, 4));
        System.out.println(count1(arr, arr.length, 1));
        System.out.println(count1(arr, arr.length, 3));
        System.out.println(count1(arr, arr.length, 8));
        System.out.println(count1(arr, arr.length, 9));
    }


    //Approach 1: best (O(logN)) => Improved binary search
    //Approach 2: Binary search => O(log N + k) where k is number of occurrences.
    //Approach 3: Iterate array and put into array list and call Collections.frequency(clist, x);

    //Approach 1: best (O(logN)) => Improved binary search
    // (find first & last occurence index and return their different)
    static int count1(int[] arr, int n, int x) {
        if(x<arr[0] || x >arr[n-1])
            return 0;
        int i = firstOccurence1(arr, x, 0, n-1);
        if(i==-1)
            return 0;
 //       int j = lastOccurence(arr, x, i, n-1, n);
        int j = lastOccurence1(arr, x, i, n-1);
        return j-i+1;
    }

/*    static int firstOccurence(int[] arr, int num, int low, int high) {
        while(low <= high) {
            int mid =  (low+high)/2;
            if((mid==0 || num > arr[mid-1]) && (num == arr[mid]))
                return mid;
            else if(num > arr[mid])
                low = mid+1;
            else
                high = mid-1;
        }
        return -1;
    }*/

    static int firstOccurence1(int arr[], int num, int low, int high) {
        int firstIndex=-1;
        while(low <= high) {
            int mid= low +(high-low/2);
            if(arr[mid] == num) {
                firstIndex=mid;
                high=mid - 1;
            } else if(arr[mid] > num)
                high = mid -1;
            else if(arr[mid] < num)
                low = mid + 1;
        }
        return firstIndex;
    }



    /*static int lastOccurence(int[] arr, int num, int low, int high, int arrLength) {
        while(low <= high) {
            int mid = (low+high)/2;
            if((mid==arrLength-1 || num < arr[mid+1]) && (num == arr[mid]))
                return mid;
            //Order of else if condition ( num < arr[mid]) followed by else condition is important
            //because for last occurence you want to still traverse forward and you reset high before low
            //else you would travel reverse and would never find
            else if(num < arr[mid])
                high = mid-1;
            else
                low = mid+1;
        }
        return -1;
    }*/

    static int lastOccurence1(int arr[], int num, int low, int high) {
        int lastIndex=-1;
        while(low <= high) {
            int mid= (low+high)/2;
            if(arr[mid] == num) {
                lastIndex=mid;
                low = mid+1;
            } else if(arr[mid] > num)
                high = mid -1;
            else if(arr[mid] < num)
                low = mid + 1;
        }
        return lastIndex;
    }

    //Approach 3: Binary search => O(log N + k) where k is number of occurrences.
    static int count2(int[] arr, int n, int x) {
        int index = binarySearch(arr, x, 0, n-1);
        if(index == -1)
            return 0;
        int count = 1;
        for(int i=index+1; i<n && arr[i] == x;i++)
            count++;
        for(int j=index-1; j>=0 && arr[j] == x;j--)
            count++;
        return count;
    }


    static int binarySearch(int[] arr, int num, int low, int high) {
        if(num<arr[low] || num >arr[high])
            return -1;
        while(low <= high) {
            int mid = low+ (high-low)/2;
            if(num == arr[mid])
                return mid;
            else if(num > arr[mid])
                low = mid+1;
            else
                high = mid-1;
        }
        return -1;
    }
}
