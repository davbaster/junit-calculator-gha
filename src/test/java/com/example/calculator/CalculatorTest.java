import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.Random;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAddition() {
        assertEquals(5.0, calculator.add(2.0, 3.0), 0.001);
        assertEquals(-1.0, calculator.add(-2.0, 1.0), 0.001);
    }

    @Test
    public void testSubtraction() {
        assertEquals(1.0, calculator.subtract(3.0, 2.0), 0.001);
        assertEquals(-3.0, calculator.subtract(-2.0, 1.0), 0.001);
    }

    @Test
    public void testMultiplication() {
        assertEquals(6.0, calculator.multiply(2.0, 3.0), 0.001);
        assertEquals(-2.0, calculator.multiply(-2.0, 1.0), 0.001);
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, calculator.divide(6.0, 3.0), 0.001);
        assertEquals(-2.0, calculator.divide(-6.0, 3.0), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisionByZero() {
        calculator.divide(1.0, 0.0);
    }

    // New random pass/fail test
    @Test
    public void testAdditionRandomPassFail() {
        Random random = new Random();
        boolean pass = random.nextBoolean(); // Randomly returns true or false

        if (!pass) {
            fail("Test failed randomly.");
        } else {
            // Normal test logic
            assertEquals(5.0, calculator.add(2.0, 3.0), 0.001);
        }
    }
}
