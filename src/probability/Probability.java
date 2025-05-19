package probability;

import org.omg.CORBA.DynAnyPackage.InvalidValue;

import java.util.Objects;

public class Probability {

    private final double chances;

    private Probability(double chances) {
        this.chances = chances;
    }

    public static Probability createProbability(double chances) throws InvalidValue {
        if (chances >= 0 && chances <= 1) {
            return new Probability(chances);
        }

        throw new InvalidValue("invalid value entered");
    }

    public Probability compliment() {
        return new Probability(1 - chances);
    }

    public Probability and(Probability probability) {
        return new Probability(chances * probability.chances);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Probability that = (Probability) o;
        return Double.compare(chances, that.chances) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(chances);
    }
}
