package lab14.sict.must.edu.mn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MultiplicationTest {
    @Test
    public void testMultiplication() {
        Multiplication multiplication = new Multiplication();
        assertNotNull(multiplication, "Asserting if the object is null");
    }

    @Test
    public void testMultiplication2() {
        Double res = Multiplication.multiply(10.0, 30.0);

        assertEquals(300.0, res);
    }

    @Test
    public void testMultiplication3() {
        Double res = Multiplication.multiply(15.0, 30.0);

        assertEquals(450.0, res);
    }
}
