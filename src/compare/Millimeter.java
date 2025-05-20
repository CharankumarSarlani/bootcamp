package compare;

import java.util.Objects;

public class Millimeter {
    private final int value;

    public Millimeter(int value) {
        this.value = value;
    }

    public Centimeter convertToCM() {
        return new Centimeter(value/10);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Millimeter that = (Millimeter) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
