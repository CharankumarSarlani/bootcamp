package compare;

import java.util.Objects;

public class Length {
    private final double inch;

    public Length(double inch) {
        this.inch = inch;
    }

    public static Length create(double feet, Unit unit) {
        return new Length(feet * unit.getFactor());
    }

    public static Length add(Length length1, Length length2) {
        return new Length(length1.inch+length2.inch);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return inch == length.inch;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(inch);
    }
}
