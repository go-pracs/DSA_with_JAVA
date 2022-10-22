package com.company;

public class Main {

    public static void main(String[] args) {
	    Queue newQueue = new Queue();

        System.out.println(newQueue.isEmpty());

        newQueue.enQueue(10);

        System.out.println(newQueue.isEmpty());

        newQueue.enQueue(20);
        newQueue.enQueue(30);
        newQueue.enQueue(40);

        System.out.println("Peek : " + newQueue.peek());

        System.out.println(newQueue.deQueue());
        System.out.println(newQueue.deQueue());

        System.out.println("Peek : " + newQueue.peek());

        System.out.println(newQueue.deQueue());
        newQueue.deleteQueue();
        System.out.println(newQueue.deQueue());
        System.out.println(newQueue.deQueue());

        newQueue.deleteQueue();

    }
}
