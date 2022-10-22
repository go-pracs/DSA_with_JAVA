package com.company;

public class QuickSort {

    public int partition(int[] arr, int start, int end) {
        int pivot = end;
        int i = start - 1;
        for(int j = start; j <= end; j++) {
            if(arr[j] <= arr[pivot]) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return i;
    }

    public void quickSort(int[] arr, int start, int end) {
        if(start < end) {
            int pivot = partition(arr, start, end);
            quickSort(arr, start, pivot - 1);
            quickSort(arr, pivot + 1, end);
        }
    }

    public void printArray(int[] arr) {
        int n = arr.length;
        System.out.println("\nSorted array: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }
}
