package com.company;

public class Main {

    public static void main(String[] args) {
	    Stack newStack = new Stack(3);
        System.out.println(newStack.isEmpty());

        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.push(4);

        System.out.println("Peek = " + newStack.peek());
        System.out.println("Peek = " + newStack.peek());
        System.out.println(newStack.pop());
        System.out.println(newStack.pop());

        newStack.delete();
        System.out.println(newStack.pop());
        System.out.println(newStack.pop());
    }
}
