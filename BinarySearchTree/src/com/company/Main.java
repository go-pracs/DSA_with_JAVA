package com.company;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree newBST = new BinarySearchTree();
        newBST.insert(70);
        newBST.insert(50);
        newBST.insert(90);
        newBST.insert(30);
        newBST.insert(60);
        newBST.insert(80);
        newBST.insert(100);
        newBST.insert(20);
        newBST.insert(40);
        newBST.insert(10);

        System.out.print("\nPreorder : ");
        newBST.preOrder(newBST.root);

        System.out.print("\nInorder : ");
        newBST.inOrder(newBST.root);

        System.out.print("\nPostorder : ");
        newBST.postOrder(newBST.root);

        System.out.println("\n");
        newBST.delete(10);

        System.out.print("\nLevelOrder : ");
        newBST.levelOrder();

        System.out.println("\n");
        newBST.search(20);

        newBST.deleteBST();
    }
}
