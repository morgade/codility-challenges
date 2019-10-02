package com.morgade.codility.challenges;

import java.util.Arrays;
import static java.util.stream.Collectors.joining;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Marcelo
 */
public class MaxCountersTest {

    @Test
    public void test1() {
        MaxCounters maxCounters = new MaxCounters();
        int[] counters = maxCounters.solution(5, new int[]{3, 4, 4, 6, 1, 4, 4});
        assertEquals("3, 2, 2, 4, 2", Arrays.stream(counters).mapToObj(i->String.valueOf(i)).collect(joining(", ")));
    }
}
