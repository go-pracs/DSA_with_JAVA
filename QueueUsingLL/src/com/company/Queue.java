package com.company;

public class Queue {
    public Node head;
    public Node tail;

    public Queue() {
        head = new Node();
        head = null;
        tail = null;
        System.out.println("Queue successfully created! Enjoy.");
    }

    public boolean isEmpty() {
        if(head == null) {
            return true;
        }
        return false;
    }

    public void enQueue(int value) {
        Node node = new Node();
        node.value = value;
        if(isEmpty()) {
            head = node;
            tail = node;
        }
        else {
            tail.next = node;
            node.next = null;
            tail = node;
        }
        System.out.println(value + " successfully inserted in Queue.");
    }

    public int deQueue() {
        int tempValue = -1;
        if(isEmpty()) {
            System.out.println("Queue is empty.");
            return tempValue;
        }
        else if(head.next == null) {
            tempValue = head.value;
            head = null;
            tail = null;
        }
        else {
            tempValue = head.value;
            head = head.next;
        }
        return tempValue;
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }

        return head.value;
    }

    public void deleteQueue() {
        if(isEmpty()) {
            System.out.println("Queue does not exist.");
            return;
        }
        head = null;
        tail = null;
        System.out.println("Queue successfully deleted.");
    }
}
