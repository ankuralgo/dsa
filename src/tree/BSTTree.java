package tree;

import java.util.ArrayList;
import java.util.List;

public class BSTTree {


    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(36);
        bt.root.left = new Node(26);
        bt.root.right = new Node(46);
        bt.root.left.left = new Node(21);
        bt.root.left.right = new Node(37);
//        bt.root.left.left.left = new Node(11);
//        bt.root.left.left.right = new Node(24);
        bt.root.right.left = new Node(41);
        bt.root.right.right = new Node(56);
//        bt.root.right.right.left = new Node(51);
//        bt.root.right.right.right = new Node(66);
        System.out.println("The Inorder traversal of given binary tree is - ");
        bt.traverseInorder();
    }

    static class Node {
        public int value;
        public Node left, right;

        public Node(int element) {
            value = element;
            left = right = null;
        }
    }

    static class BinaryTree {
        Node root;

        BinaryTree() {
            root = null;
        }

        boolean traverseInorder(Node node, int min, int max) {
            if (node == null) return true;

            if (node.value <= min || node.value > max) {
                return false;
            }
            boolean l = traverseInorder(node.left, min, node.value);

            boolean r = traverseInorder(node.right, node.value , max);
            return r && l;
        }

        void traverseInorder() {
            boolean r = traverseInorder(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
            System.out.println("Result: " + r);
        }
    }

    static class InorderTraversal {
        Node root;

        InorderTraversal() {
            root = null;
        }

        void traverseInorder(Node node) {
            if (node == null) return;
            traverseInorder(node.left);
            System.out.print(node.value + " ");
            traverseInorder(node.right);
        }
    }
}
