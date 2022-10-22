package com.company;

public class CircularQueue {
    public int[] queue;
    public int front;
    public int rear;
    public int size;

    public CircularQueue(int size) {
        this.queue = new int[size];
        this.front = -1;
        this.rear = -1;
        this.size = size;
        System.out.println("Circular Queue successfully created with size " + size);
    }

    public boolean isFull() {
        if(front == rear + 1) {
            return true;
        }
        else if(front == 0 && rear == size -1) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isEmpty() {
        if(front == -1) {
            return true;
        }
        else {
            return false;
        }
    }

    public void enQueue(int value) {
        if(isFull()) {
            System.out.println("The Queue is full.");
        }
        else if(isEmpty()) {
            front = 0;
            queue[++rear] = value;
            System.out.println("Successfully inserted " + value);
        }
        else {
            if(rear == size -1) {
                rear = 0;
            }
            else {
                rear++;
            }
            queue[rear] = value;
            System.out.println("Successfully inserted " + value);
        }
    }

    public int deQueue() {
        if(isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        else {
            int result = queue[front];
            queue[front] = Integer.MIN_VALUE;
            if(front == rear) {
                front = rear = -1;
            }
            else if(front == size -1) {
                front = 0;
            }
            else {
                front++;
                if (front == rear + 1) {
                    front = rear = -1;
                }
            }
            return result;
        }
    }

    public int peek() {
        if(!isEmpty()) {
            return queue[front];
        }
        else {
            System.out.println("Queue is empty.");
            return -1;
        }
    }

    public void deleteQueue() {
        queue = null;
        System.out.println("Queue successfully deleted.");
    }
}
