package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	    BinaryHeap newBH = new BinaryHeap(5, "Max");
	    newBH.insert(10);
	    newBH.insert(5);
        newBH.insert(15);
        newBH.insert(1);
        newBH.insert(2);
        newBH.insert(40);

        System.out.println("Peek: " + newBH.peekOfHeap());
        System.out.println("Size of Heap: " + newBH.getSizeOfHeap());

        System.out.println("Extracted node: " + newBH.extractHeadOfBH());
        System.out.print("\nLevel Order: ");
        newBH.levelOrder();

        newBH.deleteBH();
        System.out.println("Size of Heap: " + newBH.getSizeOfHeap());
    }
}
