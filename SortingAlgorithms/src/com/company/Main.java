package com.company;

public class Main {

    public static void main(String[] args) {
//		int arr[] = {10, 6, 25, 12, 39, 2}; //comment arr for bucket sort

//	    BubbleSort bs = new BubbleSort();
//	    bs.bubbleSort(arr);
//	    bs.printArray(arr);

//	    SelectionSort ss = new SelectionSort();
//	    ss.selectionSort(arr);
//	    ss.printArray(arr);

//		InsertionSort is = new InsertionSort();
//		is.insertionSort(arr);
//		is.printArray(arr);-

		int[] arr = {8, 6, 2, 1, 9, 3, 5, 7, 4};
//		BucketSort bkts = new BucketSort(arr);
//		bkts.bucketSort();
//		bkts.printArray();

		MergeSort.mergeSort(arr, 0, arr.length-1);
		MergeSort.printArray(arr);

//		QuickSort qs = new QuickSort();
//		qs.quickSort(arr, 0, arr.length-1);
//		qs.printArray(arr);
//
//		HeapSort hs = new HeapSort(arr);
//		hs.sort();
//		hs.printArray();
    }
}
