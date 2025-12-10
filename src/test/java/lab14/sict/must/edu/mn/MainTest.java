package lab14.sict.must.edu.mn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    public void testMainConstructor() {
        Main m = new Main();
        assertNotNull(m, "Main object should be created successfully");
    }

    @Test
    public void testMainMethod() {
        // Call main method with empty args to ensure it runs without exceptions
        Main.main(new String[]{});
    }
}
