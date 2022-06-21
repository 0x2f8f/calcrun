package main.lessons

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

public class Tests {
    @Test
    fun sqrCheck() {
        assertEquals(4, sqr(2));
    }

    @Test
    fun sqrtCheck() {
        assertEquals(3.0, sqrt2(9.0))
        assertEquals(4.0, sqrt3(16.0))
    }

    @Test
    fun inCheck() {
        assertTrue(inInt(2, 1, 3))
        assertFalse(inInt(1, 2, 3))

        assertTrue(inArrayInt(2, arrayOf(1, 2, 3)))
        assertFalse(inArrayInt(4, arrayOf(1, 2, 3)))
    }

    @Test
    fun arrayCheck() {
        assertEquals(4, positionInArr(3, arrayOf(1, 2, 3, 4, 5, 6)))
        assertTrue(issetWordInArr("Ivan", arrayOf("Ivanov", "Ivan", "Ivanovich")))
        assertTrue(issetNumInArr(2, intArrayOf(1, 2, 3)))
    }

}
