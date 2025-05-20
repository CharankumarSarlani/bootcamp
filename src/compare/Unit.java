package compare;

public enum Unit {
    FEET(12),
    INCH(1),
    CENTIMETER(0.4),
    MILLIMETER(0.04),
    GALLON(1/3.78),
    LITRE(1);

    private final double factor;

    Unit(double factor) {
        this.factor = factor;
    }

    public double getFactor() {
        return factor;
    }
}
