package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryNode {
    public int val;
    public BinaryNode left;
    public BinaryNode right;
    public int height;

    public BinaryNode(int value) {
        this.right = null;
        this.left = null;
        this.val = value;
        this.height = 0;
    }

}
