package com.company;

public class Main {

    public static void main(String[] args) {
	    AVLTree newAVLTree = new AVLTree();

//	    newAVLTree.insert(30);
//	    newAVLTree.insert(25);
//        newAVLTree.insert(35);
//        newAVLTree.insert(20);
//        newAVLTree.insert(15);
//        newAVLTree.insert(5);
//        newAVLTree.insert(10);
//        newAVLTree.insert(50);
//        newAVLTree.insert(60);
//        newAVLTree.insert(70);
//        newAVLTree.insert(65);

        newAVLTree.insert(5);
        newAVLTree.insert(10);
        newAVLTree.insert(15);
        newAVLTree.insert(20);
        newAVLTree.insert(12);

        System.out.print("\nLevel Order: ");
        newAVLTree.levelOrder();
        newAVLTree.delete(5);
        newAVLTree.levelOrder();
        System.out.print("\nLevel Order: ");
        newAVLTree.levelOrder();

        newAVLTree.deleteAVL();
    }
}
