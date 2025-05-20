package compare;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CentimeterTest {
    @Test
    void shouldCompareCMAndMM() {
        Centimeter centimeter = new Centimeter(1);
        Millimeter millimeter = new Millimeter(10);
        assertEquals(centimeter.convertToMM(),millimeter);
    }
}