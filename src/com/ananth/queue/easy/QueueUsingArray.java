package com.ananth.queue.easy;

public class QueueUsingArray {
    private int front, rear, maxSize, currentSize;
    private static int queue[];

    QueueUsingArray(int size) {
        this.maxSize = size;
        this.queue = new int[size];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    boolean isQueueFull() {
        return (maxSize == currentSize);
    }

    public int peek() {
        return queue[front];
    }

    public boolean isQueueEmpty(){
        return (currentSize == 0);
    }

    // function to insert an element at the rear of the queue
    public void enqueue(int data) {
        // check queue is full
        if (isQueueFull()) {
            System.out.println("Queue is full");
            return;
        }
        // for wrapping the queue in case  max size has reached
        //Unable to understand why this if condition
        if(rear==maxSize-1) {
            rear = -1;// insert element at the rear
        }
        queue[++rear] = data;
        currentSize++;
    }

    // delete at front of the queue
    public int dequeue() {
        // if queue is empty
        if (isQueueEmpty()) {
            System.out.println("Queue is empty");
            return 0;
        }
        // retrieve item then increment
        int temp = queue[front++];
        if (front == maxSize) {
            front = 0;
        }
        currentSize--;
        return temp;
    }

    // print queue elements
    public void display() {
        int i;
        if (front == rear) {
            System.out.println("\nQueue is Empty\n");
            return;
        }
        // traverse front to rear and print elements
        for (i = front; i <=rear; i++) {
            System.out.println(" <-- " + queue[i]);
        }
        return;
    }

    public static void main(String[] args){
        // Create a queue of capacity 4
        QueueUsingArray q = new QueueUsingArray(4);

        // inserting elements in the queue
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        // print Queue elements
        q.display();

        q.dequeue();
        q.dequeue();
        System.out.printf("\n\nafter two node deletion\n\n");

        // print Queue elements
        q.display();

        // print front of the queue
        q.peek();
    }
}
