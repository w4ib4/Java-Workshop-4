package Testing;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator;

    @BeforeAll
    static void setupGlobal() {
        System.out.println("Global setup");
    }

    @AfterAll
    static void cleanupGlobal() {
        System.out.println("Global cleanup");
    }

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @AfterEach
    void cleanup() {
        System.out.println("Test completed");
    }

    @Test
    void testAddition() {
        assertEquals(5, calculator.add(2, 3), "Addition failed");
    }

    @Test
    void testSubtraction() {
        assertEquals(1, calculator.subtract(3, 2), "Subtraction failed");
    }

    @Test
    void testMultiplication() {
        assertEquals(6, calculator.multiply(2, 3), "Multiplication failed");
    }

    @Test
    void testDivision() {
        assertEquals(2, calculator.divide(6, 3), "Division failed");
    }
}

public class Test10 {

}
