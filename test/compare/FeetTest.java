package compare;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class FeetTest {
    @Test
    void shouldCompareFeetAndInch() {
        Feet feet = new Feet(1);
        Inch inch = new Inch(12);
        assertEquals(feet.convertFeetToInch(), inch);
    }
}