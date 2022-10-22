package com.company;

public class Main {

    public static void main(String[] args) {
//        System.out.println(Fibonacci.fib(10));

//        System.out.println(NumberFactor.wayToGetN(5));

//        int[] houseNetWorth = {6,7,1,30,8,2,4};
//        long startTime, endTime;
//        HouseRobber hr = new HouseRobber();
//        startTime = System.nanoTime();
//        System.out.println(hr.maxMoney(houseNetWorth));
//        endTime = System.nanoTime();
//        System.out.println("D&C time: " + (endTime - startTime));

//        ConvertString cs = new ConvertString();
//        System.out.println(cs.findMinOperations("table", "tbres"));

//        int[] profits = {31,26,17,72};
//        int[] weights = {3,1,2,5};
//        ZeroOneKnapsack zks = new ZeroOneKnapsack();
//        System.out.println(zks.knapSack(profits, weights, 7));

//        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
//        System.out.println(lcs.findLCSLength("elephant", "erepat"));

//        LongestPalindromicSubsequence lps = new LongestPalindromicSubsequence();
//        System.out.println("Longest Palindromic Sequence: " + lps.findLPSLength("elrmenmet"));

//        int[][] matrix = {
//                {4,7,8,6,4},
//                {6,7,3,9,2},
//                {3,8,1,2,4},
//                {7,1,7,3,7},
//                {2,9,8,9,3}
//        };
//        MinimumCostToReachLastCell minCost = new MinimumCostToReachLastCell();
//        System.out.println(minCost.findMinCost(matrix, matrix.length-1, matrix[0].length-1 ));

//        int[][] array = {
//                {4,7,1,6},
//                {5,7,3,9},
//                {3,2,1,2},
//                {7,1,6,3}
//        };
//        NumberOfPathsToReachLastCell nop = new NumberOfPathsToReachLastCell();
//        System.out.println(nop.numberOfPaths(array, array.length-1, array[0].length-1, 25));

        int[] array = {4,2,5,3,1};

        MaxMin obj = new MaxMin();
        obj.maxmin(array);

    }
}
