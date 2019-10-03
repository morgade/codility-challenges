package com.morgade.codility.challenges;

/**
 *
 * @author osboxes
 */
public class MaxCounters {
    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int all = 0;
        int max = 0;
        
        for (int i = 0; i < A.length; i++) {
            int indexInc = A[i] - 1;
            if (indexInc<N) {
                counters[indexInc] = Math.max(all, counters[indexInc]) + 1;
                max = Math.max(counters[indexInc], max);
            } else {
                all = max;
            }
        }
        
        for (int i = 0; i < counters.length; i++) {
            counters[i] = Math.max(all, counters[i]);
        }
        
        return counters;
    }
}
