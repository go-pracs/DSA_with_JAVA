package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Fibonacci {

    // Memoization (Top-Down)
    public int fibMemo(int n, HashMap<Integer, Integer> memo) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }

        if(!memo.containsKey(n)) {
            memo.put(n, (fibMemo(n-1, memo) + fibMemo(n-2, memo)));
        }

        return memo.get(n);
    }

    //Tabulation (Bottom-Up)
    public int fibTab(int n) {
        ArrayList<Integer> tb = new ArrayList<>();
        tb.add(1);
        tb.add(1);

        for(int i = 2; i < n; i++) {
            int n1 = tb.get(i-1);
            int n2 = tb.get(i-2);

            tb.add(n1+n2);
        }

        return tb.get(n-1);
    }
}
