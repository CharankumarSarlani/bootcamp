package compare;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
    @Test
    void shouldCompareFeetAndInch() {
        Length fromFeet = Length.create(1, Unit.valueOf("FEET"));
        Length fromInch = Length.create(12, Unit.valueOf("INCH"));
        assertEquals(fromFeet,fromInch);
    }

    @Test
    void shouldCompareInchAndCm() {
        Length fromInch = Length.create(2, Unit.valueOf("INCH"));
        Length fromCM = Length.create(5, Unit.valueOf("CENTIMETER"));
        assertEquals(fromCM,fromInch);
    }

    @Test
    void shouldCompareCmAndMm() {
        Length fromCM = Length.create(1, Unit.valueOf("CENTIMETER"));
        Length fromMM   = Length.create(10,Unit.valueOf("MILLIMETER"));
        assertEquals(fromCM,fromMM);
    }

    @Test
    void shouldAddTwoSameUnits() {
        Length fromInch = Length.create(2, Unit.valueOf("INCH"));
        Length fromInch1 = Length.create(2, Unit.valueOf("INCH"));

        assertEquals(Length.add(fromInch,fromInch1),Length.create(4, Unit.valueOf("INCH")));
    }

    @Test
    void shouldAddDifferentUnits() {
        Length fromInch = Length.create(2,Unit.valueOf("INCH"));
        Length fromInch1 = Length.create(2.5, Unit.valueOf("CENTIMETER"));

        assertEquals(Length.add(fromInch,fromInch1), Length.create(3,Unit.valueOf("INCH")));
    }
}