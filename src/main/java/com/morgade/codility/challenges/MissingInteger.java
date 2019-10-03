package com.morgade.codility.challenges;

/**
 *
 * @author marcelo
 */
public class MissingInteger {
    public int solution(int[] A) {
        boolean[] ocurrences = new boolean[1_000_000];
        for (int i = 0; i < A.length; i++) {
            ocurrences[A[i]]=true;
        }
        for (int i = 1; i < ocurrences.length; i++) {
            if (!ocurrences[i])
                return i;
        }
        return 0;
    }
}
