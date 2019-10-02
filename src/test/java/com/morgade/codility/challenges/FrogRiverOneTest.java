package com.morgade.codility.challenges;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Marcelo
 */
public class FrogRiverOneTest {
    @Test
    public void test1() {
        FrogRiverOne f = new FrogRiverOne();
        int s = f.solution(5, new int[] {1, 3, 1, 4, 2, 3, 5, 4});
        assertEquals(6, s);
    }
}
