package compare;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InchTest {
    @Test
    void shouldCompareInchAndCM() {
        Inch inch = new Inch(2);
        Centimeter centimeter = new Centimeter(5);
        assertEquals(inch.convertInchToCM(),centimeter);
    }
}