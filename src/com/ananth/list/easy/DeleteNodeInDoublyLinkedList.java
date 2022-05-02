package com.ananth.list.easy;

// This class just illustrates working method in geeksforgeeks
// No insert, or main function is show here

public class DeleteNodeInDoublyLinkedList {

    static class Node {
        int data;
        Node prev, next;
        // Constructor to create a new node
        Node(int d) {
            data = d;
            prev = next = null; //not required - next and prev is by default initialized as null
        }
    }

    // function returns the head of the linkedlist
    Node deleteNode(Node head,int x) {
        if(head==null || x<=0) {
            return head;
        }

        Node node = head;
        if(x==1){
            head = head.next;
            head.prev=null;
            return head;
        } else {
            for(int i=1;i<x && node!=null;i++) {
                node = node.next;
            }

            if(node==null) {
                return head;
            } else if(node.next==null) {
                node.prev.next = null;
            } else {
                node.prev.next = node.next;
                node.next.prev = node.prev;
            }
        }
        return head;
    }
}
