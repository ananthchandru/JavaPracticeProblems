package com.ananth.maths.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {

    public static void main(String[] args) {
        int n = 5;
//        ArrayList<String> arrListStr = new GenerateBinaryNumbers().generateBinaryNosString(10);
//        System.out.println(String.valueOf(arrListStr));
        ArrayList<String> arrList = new GenerateBinaryNumbers().generateBinaryNosInteger(10);
        System.out.println(arrList);
        ArrayList<String> arrListQ = new GenerateBinaryNumbers().generateBinaryNosUsingQueue(10);
        System.out.println(arrListQ);
    }

    //using library
    public ArrayList<String> generateBinaryNosString(int n) {
        ArrayList<String> binaryNos = new ArrayList<String>();
        for(int i=1; i<=n; i++) {
            binaryNos.add(Integer.toBinaryString(i));
        }
        return binaryNos;
    }

    static ArrayList<String> generateBinaryNosInteger(int n) {
        ArrayList<String> binaryArray = new ArrayList<String>();
        for(int i=1; i<=n;i++) {
            int result = 0;
            int placeValue = 1;
            int num = i;
            while(num>0) {
                int mod = num%2;
                result += mod*placeValue;
                num=num/2;
                placeValue *=10;
            }
            binaryArray.add(Integer.toString(result));
        }
        return binaryArray;
    }

    //Function to generate binary numbers from 1 to N using a queue.
    static ArrayList<String> generateBinaryNosUsingQueue(int N)
    {
        ArrayList<String> res = new ArrayList<String>();
        Queue<String> q = new LinkedList<>();
        //pushing first binary number i.e. 1 in queue.
        q.add("1");

        while(N > 0) {
            //storing the front element of queue and popping it.
            String s1 = q.peek();
            q.poll();

            //adding the popped element in answer.
            res.add(s1);

            //generating the next two binary numbers by adding  to
            //the existing strings s1 and s2 and pushing them into queue.
            q.add(s1 + '0');
            q.add(s1 + '1');
            N--;
        }
        //returning the list.
        return res ;
    }
}

