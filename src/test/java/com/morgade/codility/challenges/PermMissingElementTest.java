package com.morgade.codility.challenges;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Marcelo
 */
public class PermMissingElementTest {
    @Test
    public void test1() {
        PermMissingElem s = new PermMissingElem();
        assertEquals(4, s.solution(new int[] { 2, 3, 1, 5}));
    }
}
