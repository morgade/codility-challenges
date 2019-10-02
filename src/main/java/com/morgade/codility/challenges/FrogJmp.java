package com.morgade.codility.challenges;

/**
 *
 * @author Marcelo
 */
public class FrogJmp {

    public static void main(String[] args) {
        SolutionFrogJmp s = new SolutionFrogJmp();
        System.out.println(s.solution(10, 85, 30));
    }
}

class SolutionFrogJmp {

    public int solution(int X, int Y, int D) {
        int dist =  Y - X;
        return (dist / D) + (dist % D > 0 ? 1 : 0);
    }
}
