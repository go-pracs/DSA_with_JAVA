package com.company;

public class CircularSingleLL {
    private Node head;
    private Node tail;
    private int size = 0;

    public Node createCircularSingleLL(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = node; // main change
        head = node;
        tail = node;
        size++;
        return head;
    }

    public void insertNodeInCSLL(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if(head == null) {
            createCircularSingleLL(nodeValue);
            return;
        }
        else if(location == 1) {
            node.next = head;
            head = node;
            tail.next = node;
        }
        else if(location > size) {
            node.next = tail.next;
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
            node.next = tempNode.next;
            tempNode.next = node;
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
            for(int i=0; i<size; i++) {
                if(tempNode.value == targetNode) {
                    System.out.println(targetNode + " found at location " + (i+1));
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
        else if(location == 1) { //to delete first node
            if(size == 1) {
                tail = null;
                head.next = null;
                head =  null;
                size--;
            }
            else {
                head = head.next;
                tail.next = head;
                size--;
            }
        }
        else if(location >= size) { //last node
            Node tempNode = head;
            for(int i = 1; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = head;
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
        for(int i=0; i<size; i++) {
            System.out.print(tempNode.value);
            if(i != size - 1) {
                System.out.print("->");
            }
            tempNode = tempNode.next;
        }

    }

    public void deleteLL() {
        if(head == null) {
            System.out.println("List does not exist! No need to delete.");
            return;
        }
        head = null;
        tail.next = null;
        tail = null;
        size = 0;
        System.out.println("LL deleted successfully.");
    }
}

