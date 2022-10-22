package com.company;

public class MaxHeap {
    private int[] heap;
    private Integer sizeOfHeap;
    private int numberOfChildren; // x

    public MaxHeap(int numberOfChildren, int size) {
        heap = new int[size + 1];
        this.numberOfChildren = numberOfChildren;
    }

    private boolean isEmpty() {
        return sizeOfHeap == 0;
    }
}
