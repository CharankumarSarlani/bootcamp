package compare;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Objects;

public class Inch {
    private final int value;

    public Inch(int value) {
        this.value = value;
    }

    public Centimeter convertInchToCM() {
        return new Centimeter((5*value)/2);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Inch inch = (Inch) o;
        return value == inch.value;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
