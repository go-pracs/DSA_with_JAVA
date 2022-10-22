package com.company;

public class MaxMin {

    public int[] arr;
    int max, min;
    private void MaxMinAlgo(int i, int j, int max, int min) {
        int max1 = Integer.MIN_VALUE , min1 = Integer.MAX_VALUE, mid;

        if(i == j) {
            max = min = arr[i];
        }
        else if(i == j-1) {
            if(arr[i] < arr[j]) {
                min = arr[i];
                max = arr[j];
            }
            else {
                max = arr[i];
                min = arr[j];
            }
        }
        else {
            mid = (i+j)/2;
            MaxMinAlgo(i, mid, max, min);
            MaxMinAlgo(mid+1, j, max1, min1);

            if(max < max1) {
                max = max1;
            }

            if(min > min1) {
                min = min1;
            }
        }
    }

    public void maxmin(int[] arr) {
        this.arr = arr;
        int max, min;
        MaxMinAlgo(0,arr.length-1, max, min);

        System.out.println("Max: " + max + "\nMin: " + min);
    }
}
