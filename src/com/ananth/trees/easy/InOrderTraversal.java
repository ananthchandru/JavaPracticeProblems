package com.ananth.trees.easy;

import java.util.ArrayList;

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
        ArrayList<Integer> list = inOrder(tree.root);
        System.out.println(list.toString());
    }

    // Function to return a list containing the inorder traversal of the tree.
    static ArrayList<Integer> inOrder(Node root) {
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
