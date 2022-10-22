package com.company;

public class BinaryHeap {
    private int[] arr;
    private Integer sizeOfHeap;
    private String mHeapType;

    public BinaryHeap(int size, String heapType) {
        arr = new int[size + 1];
        this.sizeOfHeap = 0;
        this.mHeapType = heapType;
        System.out.println("Binary Heap has been created.");
    }

    private boolean isEmpty() {
        return sizeOfHeap == 0;
    }

    public Integer getSizeOfHeap() {
        return sizeOfHeap;
    }

    // Heapify for Insertion
    private void heapifyBottomToTop(int index) {
        int parent = index/2;

        if(index <= 1) {
            return;
        }

        if(this.mHeapType.equals("Min")) {
            if(arr[index] < arr[parent]) {
                int tmp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = tmp;
            }
        }
        else if(this.mHeapType.equals("Max")) {
            if(arr[index] > arr[parent]) {
                int tmp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = tmp;
            }
        }

        heapifyBottomToTop(parent);
    }

    public void insert(int value){
        if(sizeOfHeap == arr.length - 1){
            System.out.println("Heap is full! Don't try to insert more.");
        }
        else {
            arr[++sizeOfHeap] = value;
            heapifyBottomToTop(sizeOfHeap);
            System.out.println(value + " inserted successfully!");
        }
    }

    // Heapify for deletion
    public void heapifyTopToBottom(int index) {
        int left = index*2;
        int right = index*2 + 1;
        int swapChild;

        if(sizeOfHeap < left) {
            return;
        }
        if(mHeapType.equals("Max")) {
            if(sizeOfHeap == left) {
                if(arr[index] < arr[left]) {
                    int tmp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = tmp;
                }
                return;
            }
            else {
                if(arr[left] > arr[right]) {
                    swapChild = left;
                }
                else {
                    swapChild = right;
                }
                if(arr[index] < arr[swapChild]) {
                    int tmp = arr[index];
                    arr[index] = arr[swapChild];
                    arr[swapChild] = tmp;
                }
            }
            heapifyTopToBottom(swapChild);
        }
        else if(mHeapType.equals("Min")) {
            if(sizeOfHeap == left) {
                if(arr[index] > arr[left]) {
                    int tmp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = tmp;
                }
                return;
            }
            else {
                if(arr[left] < arr[right]) {
                    swapChild = left;
                }
                else {
                    swapChild = right;
                }
                if(arr[index] > arr[swapChild]) {
                    int tmp = arr[index];
                    arr[index] = arr[swapChild];
                    arr[swapChild] = tmp;
                }
            }
            heapifyTopToBottom(swapChild);
        }
    }

    public int extractHeadOfBH() {
        if(isEmpty()) {
            return -1;
        }
        else {
            int extractedValue = arr[1];
            arr[1] = arr[sizeOfHeap--];
            heapifyTopToBottom(1);
            return extractedValue;
        }
    }

}
