package probability;

import org.junit.jupiter.api.Test;
import org.omg.CORBA.DynAnyPackage.InvalidValue;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {

    @Test
    void matchProbability() throws InvalidValue {
        Probability probability = Probability.createProbability(0.20);
        assertEquals(probability,Probability.createProbability(0.20));
    }

    @Test
    void matchCompliment() throws InvalidValue {
        Probability probability = Probability.createProbability(0.25);
        assertEquals(Probability.createProbability(0.75), probability.compliment());
    }

    @Test
    void matchCombinedProbability() throws InvalidValue {
        Probability probability = Probability.createProbability(0.5);
        assertEquals(probability.and(Probability.createProbability(0.5)), Probability.createProbability(0.25));
    }

    @Test
    void throwExceptionWhenInvalidProbabilityGiven() throws InvalidValue {
        assertThrows(InvalidValue.class, () -> {
            Probability.createProbability(2);
        });
    }
}