package com.morgade.codility.challenges;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Marcelo
 */
public class FrogJmpTest {
    @Test
    public void test1() {
        FrogJmp s = new FrogJmp();
        assertEquals(3, s.solution(10, 85, 30));
    }
}
