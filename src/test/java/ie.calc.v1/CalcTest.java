package ie.calc.v1;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

public class CalcTest {
    private MassConverter mass;

    @BeforeEach
    void init(TestInfo testInfo, TestReporter testReporter){
        testReporter.publishEntry("Testing" + "10" + testInfo.getDisplayName());
        mass = new MassConverter("10");
    }

    @DisplayName("Checking MassConverter Constructor for Illegal char")
    @Test
    void testConstructorFail() {
        assertThrows(IllegalArgumentException.class, () -> new MassConverter("a"));
    }

    @DisplayName("Checking MassConverter Constructor")
    @Test
    void testConstructorPass() {
        assertEquals(10,mass.getCalcInput());
    }
}
