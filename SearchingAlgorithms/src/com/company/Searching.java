package com.company;

public class Searching {

    public static int linearSearch(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                System.out.println(target + " found at index: " + i);
                return i;
            }
        }
        System.out.println(target + " not found.");
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length-1;
        while(low <= high) {
            int mid = (low + high)/2;
            if(arr[mid] == target) {
                System.out.println(target + " found at index: " + mid);
                return mid;
            }
            else if(target > arr[mid]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        System.out.println(target + " not found.");
        return -1;
    }
}
