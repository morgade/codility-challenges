package com.morgade.codility.challenges;

/**
 *
 * @author Marcelo
 */
public class PermCheck {

    public static void main(String[] args) {
        SolutionPermCheck s = new SolutionPermCheck();
        System.out.println(s.solution(new int[] {4,1,3}));
    }
}

class SolutionPermCheck {

    public int solution(int[] A) {
        boolean[] found = new boolean[A.length];
        
        for (int i = 0; i < found.length; i++) {
            if (A[i]>A.length || found[A[i]-1]) {
                return 0;
            } else {
                found[A[i]-1] = true;
            }
        }
        
        return 1;
    }
}

