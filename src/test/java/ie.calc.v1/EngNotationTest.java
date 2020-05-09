package ie.calc.v1;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EngNotationTest {
    private EngNotation engN;

    @BeforeEach
    void init(TestInfo testInfo, TestReporter testReporter) {
        testReporter.publishEntry("Testing" + " " + testInfo.getDisplayName());
        engN = new EngNotation(1000);
    }

    @DisplayName("Checking Convert Method")
    @Test
    void testConvertMethod() {
        assertEquals("1.0kg",engN.convert(1000,1));
    }

    @DisplayName("Checking decimal point Method")
    @Test
    void testDecimalPointMethod() {
        assertEquals(1,engN.decimalPoint());
    }

    @DisplayName("Checking EngNotation Constructor with invalid input")
    @Test
    void testConstructorFail() {
        assertThrows(IllegalArgumentException.class, () -> new EngNotation(-1));
    }

    @DisplayName("Checking EngNotation Constructor with valid input")
    @Test
    void testConstructorPass() {
        assertEquals(1000,engN.getEngValue());
    }
}
