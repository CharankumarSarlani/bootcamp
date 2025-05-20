package compare;

import java.util.Objects;

public class Feet {
    private final int value;

    public Feet(int value) {
        this.value = value;
    }

    public Inch convertFeetToInch(){
        return new Inch(value*12);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Feet feet = (Feet) o;
        return value == feet.value;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
