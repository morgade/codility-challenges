package com.morgade.codility.challenges;

/**
 *
 * @author Marcelo
 */
public class FrogJmp {

    public int solution(int X, int Y, int D) {
        int dist =  Y - X;
        return (dist / D) + (dist % D > 0 ? 1 : 0);
    }
}
