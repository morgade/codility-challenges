package com.morgade.codility.challenges;

/**
 *
 * @author Marcelo
 */
public class CyclicRotation {

    public int[] solution(int[] A, int K) {
        if (A.length==0) {
            return A;
        }
        
        K = K % A.length;
        int[] R = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            R[(i + K) % A.length] = A[i];
        }
        return R;
    }
    
}
