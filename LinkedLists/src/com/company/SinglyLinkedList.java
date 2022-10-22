package com.company;

public class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int size = 0;

    public Node createSinglyLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size++;
        return head;
    }

    public void insertNodeInLL(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if(head == null) {
            createSinglyLinkedList(nodeValue);
            return;
        }
        else if(location == 1) {
            node.next = head;
            head = node;
        }
        else if(location > size) {
            node.next = null;
            tail.next = node;
            tail = node;
        }
        else {
            Node tempNode = head;
            int index = 1;
            while(index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    public void searchNode(int targetNode) {
        if(head == null) {
            System.out.println("List not created!");
            return;
        }
        else {
            Node tempNode = head;
            int i = 1;
            while(tempNode != null) {
                if(tempNode.value == targetNode) {
                    System.out.println(targetNode + " found at location " + i);
                    return;
                }
                tempNode = tempNode.next;
                i++;
            }
        }
        System.out.println("Node not found");
    }

    public void deleteNode(int location) {
        if(head == null) {
            System.out.println("List not created!");
            return;
        }
        else if(location == 1) { //to delete first node
            head = head.next;
            size--;
            if(size == 0) {
                tail = null;
            }
        }
        else if(location >= size) { //last node
            Node tempNode = head;
            for(int i = 1; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        }
        else { //given node
            Node tempNode = head;
            int i = 1;
            while(i < location - 1) {
                tempNode = tempNode.next;
                i++;
            }
            tempNode.next = tempNode.next.next;
            size--;
            return;
        }


    }

    public void displayLL() {
        if(head == null) {
            System.out.println("List not created!");
            return;
        }
        System.out.println("The size of the list is: " + size);
        System.out.println("The list is:-");
        Node tempNode = head;
        while(tempNode != null) {
            System.out.println(tempNode.value);
            tempNode = tempNode.next;
        }

    }

    public void deleteLL() {
        if(head == null) {
            System.out.println("List does not exist! No need to delete.");
            return;
        }
        head = null;
        tail = null;
        size = 0;
        System.out.println("LL deleted successfully.");
    }
}
