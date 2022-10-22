package com.company;

import java.util.HashMap;

public class ConvertString {

    // Top Down - Memoization
    private int findMinOpMemo(String s1, String s2, int i1, int i2, HashMap<String, Integer> map) {
        if(i1 == s1.length()) {
            return s2.length() - i2;
        }
        if(i2 == s2.length()) {
            return s1.length() - i1;
        }
        if(s1.charAt(i1) == s2.charAt(i2)) {
            return findMinOpMemo(s1, s2, i1+1, i2+2, map);
        }

        String mapKey = "" + i1 + i2;
        if(!map.containsKey(mapKey)) {
            int deleteOp = 1 + findMinOpMemo(s1, s2, i1+1, i2, map);
            int insertOp = 1 + findMinOpMemo(s1, s2, i1, i2+1, map);
            int replaceOp = 1 + findMinOpMemo(s1, s2, i1+1, i2+1, map);
            map.put(mapKey, Math.min(deleteOp,Math.min(insertOp, replaceOp)));
        }


        return map.get(mapKey);
    }

    public int findMinOperationsTopDown(String s1, String s2) {
        HashMap<String, Integer> map = new HashMap<>();
        return findMinOpMemo(s1, s2, 0, 0, map);
    }

    //Bottom Up - Tabulation

    public int findMinOperationsBottomUp(String s1, String s2) {
        int[] tempArray = new int[s1.length()];

        for(int i = s1.length(); i > -1; i--) {
            int dele
        }

        return tempArray[0];
    }
}
