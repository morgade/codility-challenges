package com.morgade.codility.challenges;

/**
 *
 * @author Marcelo
 */
public class FrogRiverOne {
    public int solution(int X, int[] A) {
        boolean[] covered = new boolean[X];
        int p=-1;
        
        for (int i = 0; i < A.length && X>0; i++) {
            covered[A[i]-1] = true;
            
            for (int j = p+1; j < X && covered[j]; j++) {
                p = j;
            }
            
            if (p==X-1) {
                return i;
            }
        }
        
        return -1;
    }
}
