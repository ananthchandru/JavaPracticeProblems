package com.ananth.trees.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

//InOrderTraversalOfTree (not Binary Tree -> Order doesn't matter)
public class InOrderTraversal {

    public static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    private Node root;

    InOrderTraversal() {
        root = null;
    }

    public static void main(String[] args) {
        //Building tree inorder
        InOrderTraversal tree = new InOrderTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        ArrayList<Integer> listRecursive = inOrderRecursive(tree.root);
        LinkedList<Integer> listIterative = inOrderIterative(tree.root);
        System.out.println(listRecursive.toString());
        System.out.println(listIterative.toString());
    }

    //InOrder Traversal Iterative
    static LinkedList<Integer> inOrderIterative(Node node) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Stack<Node> stack = new Stack<Node>();
        Node current = node;

        while(current != null || !stack.isEmpty()) {
            //Reach left most
            while(current!=null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            list.add(current.data);
            //System.out.print(current.data + " ");
            current = current.right;
        }
        return list;
    }

    // InOrderTraversal Recursion
    static ArrayList<Integer> inOrderRecursive(Node root) {
        ArrayList<Integer> inOrderValues = new ArrayList<Integer>();
        inOrderTraverse(root, inOrderValues);
        return inOrderValues;
    }

    static void inOrderTraverse(Node root, ArrayList<Integer> result) {
        if(root!=null) {
            inOrderTraverse(root.left, result);
            result.add(root.data);
            inOrderTraverse(root.right, result);
        } else
            return;
    }

}
