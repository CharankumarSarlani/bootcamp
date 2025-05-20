package compare;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
    @Test
    void shouldCompareFeetAndInch() {
        Length fromFeet = Length.createFromFeet(1);
        Length fromInch = Length.createFromInch(12);
        assertEquals(fromFeet,fromInch);
    }

    @Test
    void shouldCompareInchAndCm() {
        Length fromInch = Length.createFromInch(2);
        Length fromCM = Length.createFromCM(5);
        assertEquals(fromCM,fromInch);
    }

    @Test
    void shouldCompareCmAndMm() {
        Length fromCM = Length.createFromCM(1);
        Length fromMM   = new Length(10);
        assertEquals(fromCM,fromMM);
    }
}