package com.morgade.codility.challenges;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Marcelo
 */
public class PermCheckTest {
    @Test
    public void test1() {
        PermCheck s = new PermCheck();
        assertEquals(1, s.solution(new int[] {4,1,3,2}));
    }
}
