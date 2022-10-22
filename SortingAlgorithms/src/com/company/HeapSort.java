package com.company;

public class HeapSort {
    int[] arr = null;

    public HeapSort(int[] arr) {
        this.arr = arr;
    }

    public void sort() {
        BinaryHeap bHp = new BinaryHeap(arr.length, "Min");
        for(int i : arr) {
            bHp.insert(i);
        }

        for(int i = 0; i < arr.length; i++) {
            arr[i] = bHp.extractHeadOfBH();
        }
    }

    public void printArray() {
        int n = arr.length;
        System.out.println("\nSorted array: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }
}
