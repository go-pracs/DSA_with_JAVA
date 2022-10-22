package com.company;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {
    public BinaryNode root;

    public BinaryTreeLL() {
        this.root = null;
    }

    //Preorder traversal
    public void preOrder(BinaryNode node) {
        if(node == null) {
            return;
        }
        System.out.print(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    //Inorder traversal
    public void InOrder(BinaryNode node) {
        if(node == null) {
            return;
        }
        InOrder(node.left);
        System.out.print(node.val + " ");
        InOrder(node.right);
    }

    //Postorder traversal
    public void Postorder(BinaryNode node) {
        if(node == null) {
            return;
        }
        Postorder(node.left);
        Postorder(node.right);
        System.out.print(node.val + " ");
    }

    // Level Order traversal
    public void levelOrder() throws NullPointerException {
        try {
            Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
            queue.add(root);
            while (!queue.isEmpty()) {
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
        catch(Exception e) {
            System.out.println("\nThe list does not exist!");
        }
    }

    // Search Method
    public void search(String value) {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);

        while(!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();

            if(presentNode.val == value) {
                System.out.println(value + " is found in Tree.");
                return;
            }

            if(presentNode.left != null) {
                queue.add(presentNode.left);
            }

            if(presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
        System.out.println(value + " not found.");
    }

    // Insert method
    public void insert(String value) {
        BinaryNode newNode = new BinaryNode(value);
        if(root == null) {
            root = newNode;
            System.out.println("New node inserted at root.");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);

        while(!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();

            if(presentNode.left == null) {
                presentNode.left = newNode;
                System.out.println("New node added successfully!");
                return;
            }
            else if(presentNode.right == null) {
                presentNode.right = newNode;
                System.out.println("New node added successfully!");
                return;
            }
            else {
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }
        }

    }

    // Get Deepest Node
    public BinaryNode getDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode presentNode = null;
        while(!queue.isEmpty()) {
            presentNode = queue.remove();
            if(presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if(presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
        return presentNode;
    }

    // Delete deepest node
    public void deleteDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode prevNode;
        BinaryNode currentNode = null;

        while(!queue.isEmpty()) {
            prevNode = currentNode;
            currentNode = queue.remove();

            if(currentNode.left == null) {
                prevNode.right = null;
                return;
            }
            else if(currentNode.right == null) {
                currentNode.left = null;
                return;
            }
            queue.add(currentNode.left);
            queue.add(currentNode.right);
        }
    }

    // Delete given node
    public void deleteNode(String value) {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()) {
            BinaryNode currentNode = queue.remove();
            if(currentNode.val == value) {
                currentNode.val = getDeepestNode().val;
                deleteDeepestNode();
                System.out.println("\nThe node is deleted.");
                return;
            }
            else {
                if(currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if(currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
        }
        System.out.println("\n" + value + " does not exist in the Tree.");
    }

    // Delete Tree
    public void deleteTree() {
        root = null;
        System.out.println("\nBinary Tree has been successfully deleted.");
    }
}
