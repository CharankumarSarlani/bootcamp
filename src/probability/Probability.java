package probability;

public class Probability {
    private final int favourableOutcomes;
    private final int totalOutcomes;

    public Probability(int favourableOutcomes, int totalOutcomes) {
        this.favourableOutcomes = favourableOutcomes;
        this.totalOutcomes = totalOutcomes;
    }



    public  double occur() {
        return (double)favourableOutcomes/totalOutcomes;
    }

    public double compliment() {
        return 1.0 - this.occur();
    }
}
