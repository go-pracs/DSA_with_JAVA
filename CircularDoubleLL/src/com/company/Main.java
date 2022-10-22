package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int option, value, location;
        boolean k = true;
        Scanner input = new Scanner(System.in);
        CircularDoubleLL cDLL = new CircularDoubleLL();

        System.out.println("________________________________________________");
        System.out.println("1. Create LL");
        System.out.println("2. Insert a node");
        System.out.println("3. Search a Node");
        System.out.println("4. Delete a Node");
        System.out.println("5. Display");
        System.out.println("6. Reverse traversal");
        System.out.println("7. Delete LL");
        System.out.println("8. Exit");
        System.out.println("________________________________________________");

        while(k) {
            System.out.println("\nChoose an option...");
            option = input.nextInt();

            switch (option) {
                case 1: {
                    System.out.println("Enter the value to insert: ");
                    value = input.nextInt();
                    cDLL.createDoubleLL(value);
                    break;
                }
                case 2: {
                    System.out.println("Enter the value and location: ");
                    value = input.nextInt();
                    location = input.nextInt();
                    cDLL.insertNodeInDLL(value, location);
                    break;
                }
                case 3: {
                    System.out.println("Enter the node to search: ");
                    value = input.nextInt();
                    cDLL.searchNode(value);
                    break;
                }
                case 4: {
                    System.out.println("Enter the node to be deleted: ");
                    value = input.nextInt();
                    cDLL.deleteNode(value);
                    break;
                }
                case 5: {
                    cDLL.displayLL();
                    break;
                }
                case 6: {
                    cDLL.reverseTraversal();
                    break;
                }
                case 7: {
                    cDLL.deleteLL();
                    break;
                }
                case 8: {
                    k = false;
                    break;
                }
                default:
                    System.out.println("Please choose a valid option.");
            }
        }
    }
}
