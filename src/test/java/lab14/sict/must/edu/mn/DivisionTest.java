package lab14.sict.must.edu.mn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DivisionTest {

    @Test
    public void testNormalDivision() {
        Double result = Division.divide(10.0, 2.0);
        assertEquals(5.0, result, "10 divided by 2 should be 5");
    }

    @Test
    public void testDivisionByZero() {
        Double result = Division.divide(10.0, 0.0);
        assertTrue(result.isInfinite() || result.isNaN(), "Division by zero should return Infinity or NaN");
    }
}