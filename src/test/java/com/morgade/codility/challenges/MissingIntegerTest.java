package com.morgade.codility.challenges;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Marcelo
 */
public class MissingIntegerTest {

    @Test
    public void test1() {
        MissingInteger missingInteger = new MissingInteger();
        int m = missingInteger.solution(new int[]{1, 3, 6, 4, 1, 2});
        assertEquals(5, m);
    }
}
