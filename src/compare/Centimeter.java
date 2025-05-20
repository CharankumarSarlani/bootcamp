package compare;

import java.util.Objects;

public class Centimeter {
    private final int value;

    public Centimeter(int value) {
        this.value = value;
    }

    public Millimeter convertToMM() {
        return new Millimeter(value*10);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Centimeter that = (Centimeter) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }


}
