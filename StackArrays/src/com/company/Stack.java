package com.company;

public class Stack {
    public int[] arr;
    public int top;

    public Stack(int size) {
        this.arr = new int[size];
        this.top = -1;
        System.out.println("Stack is created with size of " + size);
    }

    public boolean isEmpty() {
        if(top == -1) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isFull() {
        if(top == arr.length-1) {
            return true;
        }
        else {
            return false;
        }
    }
    public void push(int value) {
        if(isFull()) {
            System.out.println("Stack Overflow!");
            return;
        }
        else {
            arr[++top] = value;
            System.out.println(value + " successfully pushed in stack");
        }
    }

    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack Underflow!");
            System.exit(0);
        }

        int topElement = arr[top];
        top--;
        return topElement;
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Stack is Empty!");
            System.exit(0);
        }
        return arr[top];
    }

    public void delete() {
        arr = null;
        top = -1;
        System.out.println("Stack deleted successfully!");
    }
}
