package com.company;

public class LongestPalindromicSubsequence {
    private int findLPSLength(String st, int startIndex, int endIndex) {
        if(startIndex > endIndex) {
            return 0;
        }
        if(startIndex == endIndex) {
            return 1;
        }

        int c1 = 0;
        if(st.charAt(startIndex) == st.charAt(endIndex)) {
            c1 = 2 + findLPSLength(st, startIndex+1, endIndex-1);
        }
        int c2 = findLPSLength(st, startIndex+1, endIndex);
        int c3 = findLPSLength(st, startIndex, endIndex-1);

        return Math.max(c1, Math.max(c2, c3));
    }

    public int findLPSLength(String st) {
        return findLPSLength(st, 0, st.length()-1);
    }
}
