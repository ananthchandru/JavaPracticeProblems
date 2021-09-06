package com.ananth.queue.easy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
1. Reverse queue using recursion - O(N)
2. Reverse queue using another queue - O(N^2)
3. Reverse queue using stack - O(N), O(1) space (preferred)
*/

public class ReverseQueue {

    static Queue<Integer> queue;
    public static void main(String args[]) {
        queue = new LinkedList<Integer>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.add(70);
        queue.add(80);
        queue.add(90);
        queue.add(100);

//        reverseQueueUsingStack(queue);
//        reverseQueueUsingQueue(queue);
        reverseQueueUsingStack(queue);

        for(int q: queue) System.out.print(q + ",");
    }

    private static Queue<Integer> reverseQueueUsingStack(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty())
            stack.add(queue.remove());

        while (!stack.isEmpty())
            queue.add(stack.pop());

        return queue;
    }

    static Queue<Integer> reverseQueueRecursion(Queue<Integer> queue) {
        // Base case
        if (queue.isEmpty())
            return queue;
        // Dequeue current item (from front)
        int data = queue.remove();
        // Reverse remaining queue
        queue = reverseQueueRecursion(queue);
        // Enqueue current item (to rear)
        queue.add(data);
        return queue;
    }

    static Queue<Integer> reverseQueueUsingQueue(Queue<Integer> queue) {
        int s = queue.size();
        Queue<Integer> ans = new LinkedList<>();
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < queue.size() - 1; j++)
                queue.add(queue.remove());
            ans.add(queue.remove());
        }
        return ans;
    }
}
