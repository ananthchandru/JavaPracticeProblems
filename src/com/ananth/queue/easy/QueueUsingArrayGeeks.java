package com.ananth.queue.easy;

class QueueUsingArrayGeeks {

    int front, rear;
    int arr[] = new int[100005];

    QueueUsingArrayGeeks()
    {
        front=0;
        rear=0;
    }

    //Function to push an element x in a queue.
    void push(int x)
    {

        arr[rear]=x;
        rear++;
    }

    //Function to pop an element from queue and return that element.
    int pop()
    {
        if(front==rear) {
            return -1;
        } else {
            int element=arr[front];
            front++;
            return element;
        }
    }
}
