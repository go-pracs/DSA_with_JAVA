package com.company;

public class Main {

    public static void main(String[] args) {
	    BinaryTree newBinaryTree = new BinaryTree(10);
	    newBinaryTree.insert("N1");
        newBinaryTree.insert("N2");
        newBinaryTree.insert("N3");
        newBinaryTree.insert("N4");
        newBinaryTree.insert("N5");
        newBinaryTree.insert("N6");
        newBinaryTree.insert("N7");
        newBinaryTree.insert("N8");
        newBinaryTree.insert("N9");
        newBinaryTree.insert("N10");
        newBinaryTree.insert("N11");

        System.out.print("Preorder Traversal: ");
        newBinaryTree.preOrder(1);

        System.out.print("\nInorder Traversal: ");
        newBinaryTree.inOrder(1);

        System.out.print("\nPostorder Traversal: ");
        newBinaryTree.postOrder(1);

        System.out.print("\nLevel order Traversal: ");
        newBinaryTree.levelOrder();

        System.out.println("\nSearch method: ");
        newBinaryTree.search("N10");

        System.out.println("\nDelete method: ");
        newBinaryTree.delete("N5");

        System.out.print("\nLevel order Traversal: ");
        newBinaryTree.levelOrder();

        newBinaryTree.deleteBinaryTree();
    }
}
