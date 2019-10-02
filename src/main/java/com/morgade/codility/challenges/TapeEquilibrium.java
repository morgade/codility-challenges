package com.morgade.codility.challenges;

/**
 *
 * @author Marcelo
 */
public class TapeEquilibrium {
    
    public int solution(int[] A) {
        long sumL = 0;
        long sumR = 0;
        long minDiff = Integer.MAX_VALUE;
        
        for (int i = 0; i < A.length; i++) {
            sumR += A[i];
        }
        
        for (int i = 1; i < A.length; i++) {
            sumL += A[i-1];
            sumR -= A[i-1];
            minDiff = Math.min( minDiff, Math.abs( sumL - sumR ));
        }
        
        return (int) minDiff;
    }
    
}