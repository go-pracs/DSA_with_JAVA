package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//	    Queue newQueue = new Queue(4);
//        System.out.println(newQueue.isFull());
//        System.out.println(newQueue.isEmpty());
//
//        newQueue.enQueue(10);
//        newQueue.enQueue(20);
//        newQueue.enQueue(30);
//        newQueue.enQueue(40);
//        newQueue.enQueue(50);
//
//        System.out.println(newQueue.deQueue());
//        System.out.println(newQueue.deQueue());
//
//        System.out.println("Peek = " + newQueue.peek());
//        System.out.println(newQueue.deQueue());
//        System.out.println("Peek = " + newQueue.peek());
//
//        newQueue.deleteQueue();

        CircularQueue newQueue = new CircularQueue(4);
        System.out.println(newQueue.isFull());
        System.out.println(newQueue.isEmpty());

        newQueue.enQueue(10);
        newQueue.enQueue(20);
        newQueue.enQueue(30);
        newQueue.enQueue(40);
        newQueue.enQueue(50);

        System.out.println(newQueue.deQueue());
        System.out.println(newQueue.deQueue());
        newQueue.enQueue(50);
        newQueue.enQueue(60);
        newQueue.enQueue(70);

        System.out.println("Peek = " + newQueue.peek());
        System.out.println(newQueue.deQueue());
        newQueue.enQueue(70);
        newQueue.enQueue(80);
        System.out.println(newQueue.deQueue());
        System.out.println(newQueue.deQueue());
        System.out.println(newQueue.deQueue());
        System.out.println(newQueue.deQueue());
        System.out.println(newQueue.deQueue());
        newQueue.enQueue(80);
        System.out.println("Peek = " + newQueue.peek());

        newQueue.deleteQueue();
    }
}
