package com.company;

public class NumberFactor {

    public static int wayToGetN(int n) {
        if(n==0 || n==1 || n==2) {
            return 1;
            // for 0 -> 1
            // for 1 -> {1}
            // for 2 -> {1,1}
        }
        if(n==3) {
            return 2;
            // {1,1,1} {3}
        }

        return wayToGetN(n-1) + wayToGetN(n-3) + wayToGetN(n-4);
    }
}
