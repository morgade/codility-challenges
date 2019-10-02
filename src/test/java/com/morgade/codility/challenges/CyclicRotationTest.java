package com.morgade.codility.challenges;

import java.util.Arrays;
import static java.util.stream.Collectors.joining;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Marcelo
 */
public class CyclicRotationTest {
    @Test
    public void test1() {
        int[] A = new int[]{3, 8, 9, 7, 6};
        int K = 3;

        CyclicRotation s = new CyclicRotation();
        int[] R = s.solution(A, K);
        
        assertEquals("9, 7, 6, 3, 8", Arrays.stream(R).mapToObj(r -> String.valueOf(r)).collect(joining(", ")));
    }
}
