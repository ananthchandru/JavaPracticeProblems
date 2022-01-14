package com.ananth.list.easy;

/* delete a node from given position in a doubly linked list. */

public class DeleteDoublyLinkedList {
    Node head;
    /* Doubly Linked list Node*/
    static class Node {
        int data;
        Node prev;
        Node next;

        // Constructor to create a new node
        Node(int d) {
            data = d;
            prev = next = null; //not required - next and prev is by default initialized as null
        }
    }

    public static void main(String[] args) {
        /* Start with the empty list */
        DeleteDoublyLinkedList dll = new DeleteDoublyLinkedList();

        dll.insertAtBeginning(6);
        dll.insertAtBeginning(7);
        dll.insertAtBeginning(1);
        dll.insertAtBeginning(3);
        dll.insertAtBeginning(2);

        dll.printlist(dll.head);

        dll.deleteNodeAtGivenPos(3);
        dll.deleteNodeAtGivenPos(3);

        dll.printlist(dll.head);//traverse forward and reverse
    }

    // Adding a node at the front of the list
    public void insertAtBeginning(int data) {
        Node node = new Node(data);
        node.next = head;
        node.prev = null;

        if (head != null)
            head.prev = node;

        head = node;
    }

    void deleteNodeAtGivenPos(int n) {
        /* if list in NULL or invalid position is given */
        if (head == null || n <= 0)
            return;

        Node current = head;

        // traverse up to the node at position 'n' from the beginning
        for (int i = 1; current != null && i < n; i++)
            current = current.next;

        // if 'n' is greater than the number of nodes in the doubly linked list
        if (current == null)
            return;

        // delete the node pointed to by 'current'
        deleteNode(current);
    }

    public void deleteNode(Node node) {

        // 1. Base case
        if (head == null || node == null)
            return;

        // 2. If node to be deleted is head node
        if (head == node)
            head = node.next;

        // 3. Change next only if node to be deleted is NOT the last node
        if (node.next != null)
            node.next.prev = node.prev;

        // 4. Change prev only if node to be deleted is NOT the first node
        if (node.prev != null)
            node.prev.next = node.next;

        return;
    }

    public void printlist(Node node) {
        Node last = null;
        System.out.println("Traversal in forward Direction\n");
        while (node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
    }

}
