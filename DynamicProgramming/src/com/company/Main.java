package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
//	    HashMap<Integer, Integer> memo = new HashMap<>();
//	    long timeStart, timeEnd;
//        Fibonacci fib = new Fibonacci();
//        timeStart = System.nanoTime();
//        System.out.println(fib.fibMemo(10, memo));
//        timeEnd = System.nanoTime();
//
//        System.out.println("Memoization time: " + (timeEnd - timeStart));
//
//        timeStart = System.nanoTime();
//        System.out.println(fib.fibTab(10));
//        timeEnd = System.nanoTime();
//
//        System.out.println("Tabulation time: " + (timeEnd - timeStart));


//        NumberFactor np = new NumberFactor();
//        System.out.println(np.waysToGetNTopDown(5));
//        System.out.println(np.waysToGetNBottomUp(5));

//        int[] houseNetWorth = {6,7,1,30,8,2,4};
//        long startTime, endTime;
//        HouseRobber hr = new HouseRobber();
//        startTime = System.nanoTime();
//        System.out.println(hr.maxMoneyTopDown(houseNetWorth));
//        endTime = System.nanoTime();
//        System.out.println("Memoization time: " + (endTime - startTime));
//
//        startTime = System.nanoTime();
//        System.out.println(hr.maxMoneyBottomUp(houseNetWorth));
//        endTime = System.nanoTime();
//        System.out.println("Tabulation time: " + (endTime - startTime));


        ConvertString cs = new ConvertString();
        System.out.println(cs.findMinOperationsTopDown("table", "tbres"));
    }

}
