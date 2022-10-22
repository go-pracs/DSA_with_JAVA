package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class AVLTree {
    private BinaryNode root;

    public AVLTree() {
        this.root = null;
    }

    public void preOrder(BinaryNode node) {
        if(node == null) {
            return;
        }
        System.out.print(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder(BinaryNode node) {
        if(node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val + " ");
    }

    public void inOrder(BinaryNode node) {
        if(node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.val + " ");
        inOrder(node.right);
    }

    public void levelOrder() {
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

    private void searchNode(BinaryNode root, int target) {
        if(root == null) {
            System.out.println(target + " NOT found in tree.");
        }
        else if(target < root.val) {
            searchNode(root.left, target);
        }
        else if(target > root.val) {
            searchNode(root.right, target);
        }
        else {
            System.out.println(target + " found in Tree!");
        }
    }

    public void search(int target) {
        searchNode(this.root, target);
    }

    /** New Methods **/
    //  getHeight
    public int getHeight(BinaryNode node) {
        if(node == null) {
            return 0;
        }
        return node.height;
    }

    // rotateRight
    private BinaryNode rotateRight(BinaryNode disbalancedNode) {
        BinaryNode newRoot = disbalancedNode.left;
        disbalancedNode.left = disbalancedNode.left.right;
        newRoot.right = disbalancedNode;
        disbalancedNode.height = 1 + Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
        newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
        return newRoot;
    }

    // rotateLeft
    private BinaryNode rotateLeft(BinaryNode disbalancedNode) {
        BinaryNode newRoot = disbalancedNode.right;
        disbalancedNode.right = disbalancedNode.right.left;
        newRoot.left = disbalancedNode;
        disbalancedNode.height = 1 + Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
        newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
        return newRoot;
    }

    // getBalance
    public int getBalance(BinaryNode node) {
        if (node == null) {
            return 0;
        }
        return getHeight(node.left) - getHeight(node.right);
    }

    // insertNode Method
    private BinaryNode insertNode(BinaryNode node, int nodeValue) {
        if (node == null) {
            BinaryNode newNode = new BinaryNode(nodeValue);
            newNode.height = 1;
            return newNode;
        }
        else if (nodeValue < node.val) {
            node.left = insertNode(node.left, nodeValue);
        }
        else {
            node.right = insertNode(node.right, nodeValue);
        }

        node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));

        //check if Tree is balanced, if not balance it
        int balance = getBalance(node);

        // LL condition
        if (balance > 1 && nodeValue < node.left.val) {
            return rotateRight(node);
        }

        // LR condition
        if (balance > 1 && nodeValue > node.left.val) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }

        // RR condition
        if (balance < -1 && nodeValue > node.right.val) {
            return rotateLeft(node);
        }

        // RL condition
        if (balance < - 1 && nodeValue < node.right.val) {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }

        return node;
    }

    public void insert(int value) {
        this.root = insertNode(this.root, value);
    }

    // // Minimum node
    public static BinaryNode minimumNode(BinaryNode root) {
        if (root.left == null) {
            return root;
        } else {
            return minimumNode(root.left);
        }
    }

    // Delete node
    private BinaryNode deleteNode(BinaryNode node, int value) {
        // Case 1 - rotation not required
        if(node == null) {
            System.out.println("Value not found in AVL");
            return node;
        }
        if(value < node.val) {
            node.left = deleteNode(node.left, value);
        }
        else if(value > node.val) {
            node.right = deleteNode(node.right, value);
        }
        else {
            // if node have 2 children
            if (node.left != null && node.right != null) {
                BinaryNode temp = node;
                BinaryNode minNodeForRight = minimumNode(temp.right);
                node.val = minNodeForRight.val;
                node.right = deleteNode(node.right, minNodeForRight.val);
            }
            // if it has only left child
            else if (node.left != null) {
                node = node.left;
            }
            // if it has only right child
            else if (node.right != null) {
                node = node.right;
            }
            // no child
            else {
                node = null;
            }
        }
        // Case 2 - rotation required

//         System.out.println("1");
//         System.out.println(previous.value);
//
//         node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));

        int balance = getBalance(node);

        // LL
        if (balance > 1 && getBalance(node.left) >= 0) {
            return rotateRight(node);
        }
        // LR
        if (balance > 1 && getBalance(node.left) < 0) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }
        //RR
        if (balance < -1 && getBalance(node.right) <= 0) {
            return rotateLeft(node);
        }

        //RL
        if (balance < -1 && getBalance(node.right) > 0) {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }

        return node;

    }

    public void delete(int value) {
        root = deleteNode(root, value);
    }

    public void deleteAVL() {
        root = null;
        System.out.println("\nAVL Tree deleted successfully!");
    }
}
