package com.company;

// Divide and Conquer
public class MergeSort {

    public static void merge(int[] A, int left, int mid, int right) {
        int n1 = mid-left+1;
        int n2 = right - mid;
        int[] leftTmpArray = new int[n1];
        int[] rightTmpArray = new int[n2]; // temp arrays
        
        for (int i=0; i < n1; i++) {
            leftTmpArray[i] = A[left+i];
        }
        
        for (int i=0; i < n2; i++) {
            rightTmpArray[i] = A[mid+1+i];
        }

        int i = 0, j = 0, k = left;
        while(i < n1 && j < n2) {
            if (leftTmpArray[i] < rightTmpArray[j]) {
                A[k++] = leftTmpArray[i++];
            }
            else {
                A[k++] = rightTmpArray[j++];
            }
        }
        while(i < n1) {
            A[k++] = leftTmpArray[i++];
        }
        while(j < n2) {
            A[k++] = rightTmpArray[j++];
        }

    }

    public static void mergeSort(int[] arr, int left, int right) {
        if(right > left) {
            int m = (left + right)/2;
            mergeSort(arr, left, m);
            mergeSort(arr, m+1, right);
            merge(arr, left, m, right);
        }
    }

    public static void printArray(int[] arr) {
        int n = arr.length;
        System.out.println("\nSorted array: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }
}
