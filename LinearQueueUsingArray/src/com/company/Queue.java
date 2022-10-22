package com.company;

public class Queue {
    public int[] queue;
    public int front;
    public int rear;

    public Queue(int size) {
        this.queue = new int[size];
        this.front = -1;
        this.rear = -1;
        System.out.println("Queue successfully created with size " + size);
    }

    public boolean isFull() {
        if(rear == queue.length-1) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isEmpty() {
        if(front == -1 || front == rear + 1) {
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
            queue[++rear] = value;
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
            front++;
            if(front > rear) {
                front = rear = -1;
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
