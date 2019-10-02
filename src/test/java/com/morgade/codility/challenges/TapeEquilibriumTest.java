package com.morgade.codility.challenges;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Marcelo
 */
public class TapeEquilibriumTest {
    @Test
    public void test1() {
        TapeEquilibrium s = new TapeEquilibrium();
        assertEquals(2, s.solution(new int[] {3,1}));
    }
}
