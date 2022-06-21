package main.lessons

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

public class Tests {
    @Test
    fun sqrCheck() {
        assertEquals (4, sqr(2));
    }

    @Test
    fun sqrtCheck() {
        assertEquals(3.0, sqrt2(9.0))
        assertEquals(4.0, sqrt3(16.0))
    }

}
