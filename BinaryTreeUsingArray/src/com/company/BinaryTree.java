package com.company;

public class BinaryTree {
    private String[] arr;
    int lastUsedIndex;

    public BinaryTree(int size) {
        arr = new String[size + 1];
        lastUsedIndex = 0;
        System.out.println("Blank Tree of size " + size + " has been created.");
    }

    // isFull
    public boolean isFull() {
        if(arr.length - 1 == lastUsedIndex) {
            return true;
        }
        return false;
    }

    // insert method
    void insert(String value) {
        if(!isFull()) {
            arr[lastUsedIndex+1] = value;
            lastUsedIndex++;
            System.out.println(value + " has been inserted in Tree.");
            return;
        }
        System.out.println("The Tree is full!");
    }

    // preOrder traversal
    public void preOrder(int index) {
        if(index > lastUsedIndex) {
            return;
        }
        System.out.print(arr[index] + " ");
        preOrder(index* 2);
        preOrder(index * 2 + 1);
    }

    // Inorder traversal
    public void inOrder(int index) {
        if(index > lastUsedIndex) {
            return;
        }
        inOrder(index* 2);
        System.out.print(arr[index] + " ");
        inOrder(index * 2 + 1);
    }

    // PostOrder traversal
    public void postOrder(int index) {
        if(index > lastUsedIndex) {
            return;
        }
        postOrder(index* 2);
        postOrder(index * 2 + 1);
        System.out.print(arr[index] + " ");
    }

    // Level Order traversal
    public void levelOrder() {
        for(int i = 1; i <= lastUsedIndex; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // search method
    public int search(String value) {
        for(int i = 1; i <= lastUsedIndex; i++) {
            if(arr[i] == value) {
                System.out.println(value + " found in Tree at position " + i);
                return i;
            }
        }
        System.out.println("Element not found!");
        return -1;
    }

    // delete method
    public void delete(String value) {
        int index = search(value);
        if(index == -1) {
            return;
        }
        else {
            arr[index] = arr[lastUsedIndex];
            lastUsedIndex--;
            System.out.println(value + " deleted from the Tree.");

        }
    }

    // delete tree
    public void deleteBinaryTree() {
        try {
            arr = null;
            lastUsedIndex = -1;
            System.out.println("\nThe tree has been deleted.");
        }
        catch(Exception e) {
            System.out.println("\nThere was an error deleteing the tree.");
        }
    }
}
