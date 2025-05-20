package compare;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeTest  {
    @Test
    void shouldCompareGallonsAndLitres() {
        Volume fromLitre = Volume.createFromLitre(3.78);
        Volume fromGallon = new Volume(1);
        assertEquals(fromLitre,fromGallon);
    }
}