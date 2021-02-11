package utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    private MathUtils mathUtils;

    @BeforeEach
    void setUp(){
        mathUtils = new MathUtils();
    }

    @Test
    void testAddNumbers(){
//        int expected = 2;
//        int actual = mathUtils.add(1, 1);
//        assertEquals(expected, actual);
        assertAll(
                ()-> assertEquals(2, mathUtils.add(1, 1)),
                ()-> assertEquals(0, mathUtils.add(1, -1))
        );
    }

    @Test
    void testComputeCircleArea(){
        double expected = 314.15;
        assertEquals(expected, mathUtils.computeCircleAres(10), 3, "Circle sres fail");

    }

    @Test
    void whenDivideTwoNumbers_shouldReturnDouble(){
        double expected = 2.0;
        double actual = mathUtils.divide(10.0, 5.0);
        assertEquals(expected, actual, "");
    }

    @Test
    void whenDivideForCero_shouldThrowError(){
        assertThrows(ArithmeticException.class, ()->mathUtils.divide(1, 0), "Should throw an exception");
    }

}