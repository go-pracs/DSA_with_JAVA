package com.company;

public class BinaryNode {
    public String val;
    public BinaryNode left;
    public BinaryNode right;
    public int height;

    public BinaryNode(String value) {
        this.val = value;
        this.right = null;
        this.left = null;
    }
}
