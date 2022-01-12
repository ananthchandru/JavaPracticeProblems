package com.ananth.trees.easy;

//PreOrderTraversalOfTree (not Binary Tree -> Order doesnt matter)

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

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
        ArrayList<Integer> list = preOrderRecursive(tree.root);
        List<Integer> llist = preOrderIterative(tree.root);
        System.out.println(list.toString());
        System.out.println(llist.toString());
    }

    // Function to return a list containing the inorder traversal of the tree.
    static ArrayList<Integer> preOrderRecursive(Node root) {
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

    /* Non-recursive pre-order using Stack */
    public static List<Integer> preOrderIterative(Node node) {
        List<Integer> list = new LinkedList<Integer>();
        Stack<Node> nodeStack = new Stack<Node>();
        nodeStack.push(node);

        while (!nodeStack.empty()) {
            Node n = nodeStack.pop();
            list.add(n.data);
            if (n.right != null) nodeStack.push(n.right);
            if (n.left != null) nodeStack.push(n.left);
        }
        return list;
    }
}
