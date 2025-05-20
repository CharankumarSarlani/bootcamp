package compare;

import org.omg.CORBA.DynAnyPackage.InvalidValue;

public class CompareLength {
    private final int unit1;
    private final int unit2;

    private CompareLength(int unit1, int unit2) {
        this.unit1 = unit1;
        this.unit2 = unit2;
    }

    public static CompareLength create(int feet, int inch) throws InvalidValue {
        if(feet < 0 || inch < 0) {
            throw new InvalidValue("invalid value");
        }

        return new CompareLength(feet,inch);
    }

    public boolean equals() {
        return convertFeetToInch() == unit2;
    }

    private int convertFeetToInch() {
        return unit1 * 12;
    }
}
