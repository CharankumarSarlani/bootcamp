package compare;

import java.util.Objects;

public class Length {
    private static final int FEETTOMMFACTOR = 300;
    private static final int INCHTOMMFACTOR = 25;
    private static final int CMTOMMFACTOR = 10;
    private final int mm;

    public Length(int mm) {
        this.mm = mm;
    }

    public static Length createFromFeet(int feet) {
        return new Length(feet * FEETTOMMFACTOR);
    }

    public static Length createFromInch(int inch) {
        return new Length(inch * INCHTOMMFACTOR);
    }

    public static Length createFromCM(int cm) {
        return new Length(cm * CMTOMMFACTOR);
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
