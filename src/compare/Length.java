package compare;

import java.util.Objects;

public class Length {
    private final int mm;

    public Length(int mm) {
        this.mm = mm;
    }

    public static Length createFromFeet(int feet) {
        return new Length(feet*300);
    }

    public static Length createFromInch(int inch) {
        return new Length(inch * 25);
    }

    public static Length createFromCM(int cm) {
        return new Length(cm * 10);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return mm == length.mm;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(mm);
    }
}
