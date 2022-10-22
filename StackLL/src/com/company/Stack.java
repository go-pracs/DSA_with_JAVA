package com.company;

public class Stack {
    StackNode head;

    public Stack() {
        head = new StackNode();
        head = null;
    }

    public boolean isEmpty() {
        if(head == null) {
            return true;
        }
        else {
            return false;
        }
    }

    public void push(int value) {
        StackNode node = new StackNode();
        node.value = value;
        if(head == null) {
            node.next = null;
            head = node;
        }
        else {
            node.next = head;
            head = node;
        }
    }

    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack Underflow!");
            System.exit(0);
        }
        int topValue = head.value;
        head = head.next;
        return topValue;
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Stack is Empty!");
            System.exit(0);
        }
        return head.value;
    }

    public void delete() {
        head = null;
        System.out.println("Stack deleted successfully!");
    }
}
