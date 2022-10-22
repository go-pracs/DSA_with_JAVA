package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] arr = {1,2,3,4,5,6,7,8,9};

        System.out.println(Searching.linearSearch(arr, 7) + "\b");
        System.out.println(Searching.binarySearch(arr, 9) + "\b");
    }
}
