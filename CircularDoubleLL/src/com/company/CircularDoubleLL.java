package com.company;

public class CircularDoubleLL {
    private DoublyNode head;
    private DoublyNode tail;
    private int size = 0;

    public DoublyNode createDoubleLL(int DoublyNodeValue) {
        head = new DoublyNode();
        DoublyNode node = new DoublyNode();
        node.prev = node;
        node.value = DoublyNodeValue;
        node.next = node; // main change
        head = node;
        tail = node;
        size++;
        return head;
    }

    public void insertNodeInDLL(int DoublyNodeValue, int location) {
        if(head == null) {
            createDoubleLL(DoublyNodeValue);
            return;
        }
        DoublyNode node = new DoublyNode();
        node.value = DoublyNodeValue;
        if(location == 1) { // first location
            node.prev = tail;
            tail.next = node;
            node.next = head;
            head.prev = node;
            head = node;
        }
        else if(location > size) { // last location
            node.next = head;
            head.prev = node;
            node.prev = tail;
            tail.next = node;
            tail = node;
        }
        else { // given location
            DoublyNode tempNode = head;
            int index = 1;
            while(index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            tempNode.next.prev = node;
            node.next = tempNode.next;
            node.prev = tempNode;
            tempNode.next = node;
        }
        size++;
    }

    public void searchNode(int targetDoublyNode) {
        if(head == null) {
            System.out.println("List not created!");
            return;
        }
        else {
            DoublyNode tempNode = head;
            for(int i=0; i<size; i++) {
                if(tempNode.value == targetDoublyNode) {
                    System.out.println(targetDoublyNode + " found at location " + (i+1));
                    return;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found");
    }

    public void deleteNode(int location) {
        if(head == null) {
            System.out.println("List not created!");
            return;
        }
        else if(location == 1) { //to delete first DoublyNode
            if(size == 1) {
                head.next = null;
                head.prev = null;
                tail = null;
                head = null;
                size--;
            }
            else {
                head = head.next;
                tail.next = head;
                head.prev = tail;
                size--;
            }
        }
        else if(location >= size) { //last DoublyNode
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
            size--;
        }
        else { //given DoublyNode
            DoublyNode tempNode = head;
            int i = 1;
            while(i < location - 1) {
                tempNode = tempNode.next;
                i++;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;
            size--;
        }


    }

    public void displayLL() {
        if(head == null) {
            System.out.println("List not created!");
            return;
        }
        System.out.println("The size of the list is: " + size);
        System.out.println("The list is:-");
        DoublyNode tempNode = head;
        for(int i=0; i<size; i++) {
            System.out.print(tempNode.value);
            if(i != size - 1) {
                System.out.print("->");
            }
            tempNode = tempNode.next;
        }

    }

    public void reverseTraversal() {
        if(head == null) {
            System.out.println("List not created!");
            return;
        }
        System.out.println("The size of the list is: " + size);
        System.out.println("Reverse Traversal:-");
        DoublyNode tempNode = tail;
        for(int i=0; i<size; i++) {
            System.out.print(tempNode.value);
            if(i != size - 1) {
                System.out.print("<-");
            }
            tempNode = tempNode.prev;
        }
        System.out.println("\n");
    }

    public void deleteLL() {
        if(head == null) {
            System.out.println("List does not exist! No need to delete.");
            return;
        }
        DoublyNode tempNode = head.next;
        for(int i=0; i<size; i++) {
            tempNode.prev = null;
            tempNode = tempNode.next;
        }
        tail.next = null;
        head = null;
        tail = null;
        size = 0;
        System.out.println("LL deleted successfully.");
    }
}
