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
        int expected = 2;
        int actual = mathUtils.add(1, 1);
        assertEquals(expected, actual);
    }

    @Test
    void testComputeCircleArea(){
        double expected = 314.15;
        assertEquals(expected, mathUtils.computeCircleAres(10), 3, "Circle sres fail");

    }

}