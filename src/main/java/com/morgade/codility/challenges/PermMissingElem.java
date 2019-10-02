package com.morgade.codility.challenges;

/**
 *
 * @author osboxes
 */
public class PermMissingElem {

    public int solution(int[] A) {
        long sumValues = 0;
        long sumIndexes = 0;
        for (int i = 0; i < A.length; i++) {
            sumValues += A[i];
            sumIndexes += (i+1);
        }
        
        return (int) (A.length + 1 + (sumIndexes - sumValues));
    }
}
