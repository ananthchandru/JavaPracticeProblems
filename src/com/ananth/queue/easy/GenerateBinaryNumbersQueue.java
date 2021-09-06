package com.ananth.queue.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbersQueue {
    // This function uses queue data structure to print
    // binary numbers --> based on logic 1 is followed by 1+"0", 1+"1"
    // similary, 10,11 is followed by 10+"0", 10+"1",11+"0", 11+"1"

    // Time complexity => O(N)
    public static ArrayList<String> generatePrintBinary(int n)   {
        ArrayList<String> binaryNos = new ArrayList<String>();
        Queue<String> q = new LinkedList<String>();
        // Enqueue the first binary number
        q.add("1");

        while (n > 0) {
            // append 0 and 1 to the front element of the queue and
            // enqueue both strings
            String s1 = q.peek();
            q.add(s1 + "0");
            q.add(s1 + "1");
            binaryNos.add(q.poll());
            n--;
        }
        return binaryNos;
    }

    // Driver program to test above function
    public static void main(String[] args) {
        int n = 5;
        ArrayList<String> binaryNos = generatePrintBinary(n);
        System.out.println(binaryNos.toString());
    }
}
