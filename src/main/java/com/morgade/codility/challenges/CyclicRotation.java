package com.morgade.codility.challenges;

import java.util.Arrays;
import static java.util.stream.Collectors.joining;

/**
 *
 * @author Marcelo
 */
public class CyclicRotation {

    public static void main(String[] args) {
        int[] A = new int[]{3, 8, 9, 7, 6};
        int K = 3;

        Solution s = new Solution();
        int[] R = s.solution(A, K);
        System.out.println(Arrays.stream(R).mapToObj(r -> String.valueOf(r)).collect(joining(", ")) );
    }

}

class Solution {

    public int[] solution(int[] A, int K) {
        K = K % A.length;
        int[] R = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            R[(i + K) % A.length] = A[i];
        }
        return R;
    }
}
