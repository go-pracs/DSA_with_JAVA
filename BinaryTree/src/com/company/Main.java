package com.company;

public class Main {

    public static void main(String[] args) {
	    BinaryTreeLL binaryTree = new BinaryTreeLL();

	    BinaryNode N1 = new BinaryNode("N1");
        BinaryNode N2 = new BinaryNode("N2");
        BinaryNode N3 = new BinaryNode("N3");
        BinaryNode N4 = new BinaryNode("N4");
        BinaryNode N5 = new BinaryNode("N5");
        BinaryNode N6 = new BinaryNode("N6");
        BinaryNode N7 = new BinaryNode("N7");
        BinaryNode N8 = new BinaryNode("N8");
        BinaryNode N9 = new BinaryNode("N9");

        N1.left = N2;
        N1.right = N3;
        N2.left = N4;
        N2.right = N5;
        N3.left = N6;
        N3.right = N7;
        N4.left = N8;
        N4.right = N9;

        binaryTree.root = N1;

        System.out.println("Preorder Traversal: ");
        binaryTree.preOrder(binaryTree.root);

        System.out.println("\n\nInorder Traversal: ");
        binaryTree.InOrder(binaryTree.root);

        System.out.println("\n\nPostorder Traversal: ");
        binaryTree.Postorder(binaryTree.root);

        System.out.println("\n\nLevel Order Traversal");
        binaryTree.levelOrder();


        System.out.println("\n\nSearch Method: ");
        binaryTree.search("N7 ");

        binaryTree.insert("N10");
        binaryTree.insert("N11");
        binaryTree.insert("N12");
        binaryTree.insert("N13");
        System.out.println("Preorder Traversal: ");
        binaryTree.preOrder(binaryTree.root);
        System.out.println("\n\nInorder Traversal: ");
        binaryTree.InOrder(binaryTree.root);

        binaryTree.deleteDeepestNode();
        binaryTree.deleteDeepestNode();
        binaryTree.deleteDeepestNode();
        binaryTree.deleteDeepestNode();
        System.out.println("\n\nLevel Order Traversal");
        binaryTree.levelOrder();

        binaryTree.deleteNode("N1");
        binaryTree.levelOrder();

        binaryTree.deleteTree();

        binaryTree.levelOrder();

    }
}
