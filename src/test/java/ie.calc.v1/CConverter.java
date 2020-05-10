package ie.calc.v1;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CConverter {

    @BeforeEach
    void init(TestInfo testInfo, TestReporter testReporter) {
        testReporter.publishEntry("Testing" + " " + testInfo.getDisplayName());
    }

    @DisplayName("Checking Currency Converter Constructor with null input")
    @Test
    void testConstructor() {
        assertThrows(IllegalArgumentException.class, () -> new CurrencyConverter(""));
    }
    @DisplayName("Checking MassConverter Constructor with valid input")
    @Test
    void testConstructorPass() {
        CurrencyConverter f = new CurrencyConverter("100");
        assertEquals(100,f.getMinput());
    }
}
