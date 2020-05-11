package ie.calc.v1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class VolumeConverterTest {

    @BeforeEach
    void init(TestInfo testInfo, TestReporter testReporter) {
        testReporter.publishEntry("Testing" + " " + testInfo.getDisplayName());
    }

    @DisplayName("Checking VolumeConverter Constructor with Invalid input")
    @Test
    void testConstructorFail() {
        assertThrows(IllegalArgumentException.class, () -> new MassConverter(""));
    }

    @DisplayName("Checking VolumeConverter Constructor with valid input")
    @Test
    void testConstructorPass() {
        VolumeConverter mass = new VolumeConverter("30");
        assertEquals(30,mass.getCalcInput());
    }
}
