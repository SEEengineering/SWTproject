package ie.calc.v1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MassConverterTest {

    @BeforeEach
    void init(TestInfo testInfo, TestReporter testReporter) {
        testReporter.publishEntry("Testing" + " " + testInfo.getDisplayName());
    }

    @DisplayName("Checking MassConverter Constructor with null input")
    @Test
    void testConstructorFail() {
        assertThrows(IllegalArgumentException.class, () -> new MassConverter(null));
    }

    @DisplayName("Checking MassConverter Constructor with valid input")
    @Test
    void testConstructorPass() {
        MassConverter mass = new MassConverter("100");
        assertEquals(100,mass.getCalcInput());
    }
}
