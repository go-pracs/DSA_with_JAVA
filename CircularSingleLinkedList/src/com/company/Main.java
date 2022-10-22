package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            int option, value, location;
            boolean k = true;
            Scanner input = new Scanner(System.in);
            CircularSingleLL cSLL = new CircularSingleLL();

            System.out.println("________________________________________________");
            System.out.println("1. Create LL");
            System.out.println("2. Insert a node");
            System.out.println("3. Search a Node");
            System.out.println("4. Delete a Node");
            System.out.println("5. Display");
            System.out.println("6. Delete LL");
            System.out.println("7. Exit");
            System.out.println("________________________________________________");

            while(k) {
                System.out.println("\nChoose an option...");
                option = input.nextInt();

                switch(option) {
                    case 1: {
                        System.out.println("Enter the value to insert: ");
                        value = input.nextInt();
                        cSLL.createCircularSingleLL(value);
                        break;
                    }
                    case 2: {
                        System.out.println("Enter the value and location: ");
                        value = input.nextInt();
                        location = input.nextInt();
                        cSLL.insertNodeInCSLL(value,location);
                        break;
                    }
                    case 3: {
                        System.out.println("Enter the node to search: ");
                        value = input.nextInt();
                        cSLL.searchNode(value);
                        break;
                    }
                    case 4: {
                        System.out.println("Enter the node to be deleted: ");
                        value = input.nextInt();
                        cSLL.deleteNode(value);
                        break;
                    }
                    case 5: {
                        cSLL.displayLL();
                        break;
                    }
                    case 6: {
                        cSLL.deleteLL();
                        break;
                    }
                    case 7: {
                        k = false;
                        break;
                    }
                    default:
                        System.out.println("Please choose a valid option.");
                }

            }
    }
}
