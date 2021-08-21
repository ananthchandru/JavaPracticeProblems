package com.ananth.trees.easy;

//PreOrderTraversalOfTree (not Binary Tree -> Order doesnt matter)

import java.util.ArrayList;

public class PreOrderTraversal {

    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    private Node root;

    PreOrderTraversal() {
        root = null;
    }

    public static void main(String[] args) {
        //Building tree inorder
        PreOrderTraversal tree = new PreOrderTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        ArrayList<Integer> list = preOrder(tree.root);
        System.out.println(list.toString());
    }

    // Function to return a list containing the inorder traversal of the tree.
    static ArrayList<Integer> preOrder(Node root) {
        ArrayList<Integer> preOrderValues = new ArrayList<Integer>();
        preOrderTraverse(root, preOrderValues);
        return preOrderValues;
    }

    static void preOrderTraverse(Node root, ArrayList<Integer> result) {
        if(root!=null) {
            result.add(root.data);
            preOrderTraverse(root.left, result);
            preOrderTraverse(root.right, result);
        } else
            return;
    }
}
