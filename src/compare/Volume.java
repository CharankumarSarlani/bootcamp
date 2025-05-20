package compare;

import java.util.Objects;

public class Volume {

    public static final double FACTOR = 1 / 3.78;
    private final double gallon;

    public Volume(double gallon) {
        this.gallon = gallon;
    }

    public static Volume createFromLitre(double litre) {
        return new Volume(litre * FACTOR);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume = (Volume) o;
        return Double.compare(gallon, volume.gallon) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(gallon);
    }
}
