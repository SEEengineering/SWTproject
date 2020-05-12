package ie.calc.v1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DistanceConverterTest {

    @BeforeEach
    void init(TestInfo testInfo, TestReporter testReporter) {
        testReporter.publishEntry("Testing" + " " + testInfo.getDisplayName());
    }

    @DisplayName("Checking DistanceConverter Constructor with Invalid input")
    @Test
    void testConstructorFail() {
        assertThrows(IllegalArgumentException.class, () -> new DistanceConverter(""));
    }

    @DisplayName("Checking DistanceConverter Constructor with valid input")
    @Test
    void testConstructorPass() {
        DistanceConverter dist = new DistanceConverter("30");
        assertEquals(30,dist.getCalcInput());
    }
}
