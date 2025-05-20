package compare;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeTest  {
    @Test
    void shouldCompareGallonsAndLitres() {
        Volume fromGallon = Volume.create(1,Unit.valueOf("GALLON"));
        Volume fromLitre = new Volume(1);
        assertEquals(fromLitre,fromGallon);
    }

    @Test
    void shouldAddDifferentUnits() {

    }
}