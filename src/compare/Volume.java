package compare;

import java.util.Objects;

public class Volume {
    private final double litre;

    public Volume(double litre) {
        this.litre = litre;
    }

    public static Volume create(double litre, Unit unit) {
        return new Volume(litre * unit.getFactor());
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume = (Volume) o;
        return Double.compare(litre, volume.litre) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(litre);
    }
}
