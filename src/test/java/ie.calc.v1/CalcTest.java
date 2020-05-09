package ie.calc.v1;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

public class CalcTest {

    @DisplayName("Checking MassConverter Constructor with empty input")
    @Test
    void testConstructorFail() {
        assertThrows(IllegalArgumentException.class, () -> new MassConverter(""));
    }

    @DisplayName("Checking MassConverter Constructor with valid input")
    @Test
    void testConstructorPass() {
        MassConverter mass = new MassConverter("100");
        assertEquals(100,mass.getCalcInput());
    }

}
