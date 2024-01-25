package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {

    private SumCalculator instance;

    @BeforeEach
    void setUp() {
        instance = new SumCalculator();
    }


    @Test
    void behaviorTest() {
        assertEquals(6, instance.sum(3));
        assertEquals(1, instance.sum(1));
    }

    @Test
    void illegalArgumentTest() {
        assertThrows(IllegalArgumentException.class, () -> instance.sum(0));
    }

}