package com.company;

import java.util.HashMap;

public class HouseRobber {
    // Top Down - Memoization
    private int maxMoneyMemo(int[] HouseNetWorth, int currentIndex, HashMap<Integer, Integer> map) {
        if(currentIndex >= HouseNetWorth.length) {
            return 0;
        }

        if(!map.containsKey(currentIndex)) {
            int stealCurrentHouse = HouseNetWorth[currentIndex] + maxMoneyMemo(HouseNetWorth,currentIndex+2, map);
            int skipCurrentHouse = maxMoneyMemo(HouseNetWorth, currentIndex+1, map);
            map.put(currentIndex, Math.max(stealCurrentHouse,skipCurrentHouse));
        }

        return map.get(currentIndex);
    }

    public int maxMoneyTopDown(int[] HouseNetWorth) {
        HashMap<Integer, Integer> map = new HashMap<>();
        return maxMoneyMemo(HouseNetWorth, 0, map);
    }

    // Bottom Up - Tabulation
    public int maxMoneyBottomUp(int[] HouseNetWorth) {
        int[] tempAr = new int[HouseNetWorth.length + 2];
        for(int i = HouseNetWorth.length-1; i > -1; i--) {
            tempAr[i] = Math.max((HouseNetWorth[i] + tempAr[i+2]), tempAr[i+1]);
        }
        return tempAr[0];
    }

}
