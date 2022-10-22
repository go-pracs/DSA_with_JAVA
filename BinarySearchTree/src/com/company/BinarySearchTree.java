package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    public BinaryNode root;

    public BinarySearchTree() {
        this.root = null;
    }

    // Insert Method
    private BinaryNode insertNode(BinaryNode currentNode, int value) {
        if(currentNode == null) {
            BinaryNode newNode = new BinaryNode(value);
            System.out.println(value + " is successfully inserted.");
            return newNode;
        }
        else if(value <= currentNode.val) {
            currentNode.left = insertNode(currentNode.left, value);
            return currentNode;
        }
        else {
            currentNode.right = insertNode(currentNode.right, value);
            return currentNode;
        }
    }

    public void insert(int value) {
        this.root = insertNode(this.root, value);
    }

    // Preorder traversal
    public void preOrder(BinaryNode node) {
        if(node == null) {
            return;
        }
        System.out.print(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // Inorder traversal
    public void inOrder(BinaryNode node) {
        if(node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.val + " ");
        inOrder(node.right);
    }

    // Postorder traversal
    public void postOrder(BinaryNode node) {
        if(node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val + " ");
    }

    // Level Order traversal
    public void levelOrder() {
        if(this.root == null) {
            System.out.println("Tree does not exist.");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(this.root);
        while(!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.val + " ");

            if(presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if(presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
    }

    // search method
    private void searchNode(BinaryNode node, int value) {
        if(node == null) {
            System.out.println(value + " not found in BST.");
        }
        else if(value == node.val) {
            System.out.println(value + " found in BST!");

        }
        else if(value < node.val) {
            searchNode(node.left, value);
        }
        else {
            searchNode(node.right, value);
        }
    }

    public void search(int value) {
        searchNode(this.root, value);
    }

    // Minimum node
    private static BinaryNode minimumNode(BinaryNode root) {
        if(root.left == null) {
            return root;
        }
        else {
            return minimumNode(root.left);
        }
    }

    //Delete node
    private BinaryNode deleteNode(BinaryNode root, int value) {
        if(root == null) {
            System.out.println(value + " not found in BST! How will I delete?");
            return null;
        }
        if( value < root.val) {
            root.left = deleteNode(root.left, value);
        }
        else if(value > root.val) {
            root.right = deleteNode(root.right, value);
        }
        else {
            if(root.left != null && root.right != null) {
                BinaryNode temp = root;
                BinaryNode minNodeForRight = minimumNode(temp.right);
                root.val = minNodeForRight.val;
                root.right = deleteNode(root.right, minNodeForRight.val);
            }
            else if(root.left != null) {
                root = root.left;
            }
            else if( root.right != null) {
                root = root.right;
            }
            else {
                root = null;
            }
        }
        return root;
    }

    // delete method
    public void delete(int value) {
        deleteNode(this.root, value);
    }

    // Delete Tree
    public void deleteBST() {
        this.root = null;
        System.out.println("BST deleted successfully");
    }
    
}
