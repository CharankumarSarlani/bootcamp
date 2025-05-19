package probability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest   {
    @Test
    void calculatesProbabilityOfGettingTail() {
        Probability probability = new Probability(3,4);
        assertEquals(0.5, probability.occur());
    }

    @Test
    void calculateProbabilityOfNotGettingTail() {
        Probability probability = new Probability(3,4);
        assertEquals(0.5, probability.compliment());
    }
}