package compare;

public enum VolumeUnit {
    GALLON(3.78),
    LITRE(1);

    private final double factor;

    VolumeUnit(double factor) {
        this.factor = factor;
    }

    public double getFactor() {
        return factor;
    }
}
