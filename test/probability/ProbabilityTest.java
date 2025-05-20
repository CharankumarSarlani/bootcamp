package probability;

import org.junit.jupiter.api.Test;
import org.omg.CORBA.DynAnyPackage.InvalidValue;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest  {

    @Test
    void calculateChancesOfGettingTails() throws InvalidValue {
        Probability gettingTails = Probability.create(0.20);
        assertEquals(gettingTails,Probability.create(0.20));
    }

    @Test
    void calculateChancesOfNotGettingTails() throws InvalidValue {
        Probability notGettingTails = Probability.create(0.25);
        assertEquals(Probability.create(0.75), notGettingTails.compliment());
    }

    @Test
    void matchCombinedProbability() throws InvalidValue {
        Probability p1 = Probability.create(0.5);
        Probability p2 = Probability.create(0.5);

        assertEquals(Probability.create(0.25), p1.and(p2) );
    }

    @Test
    void throwExceptionWhenInvalidProbabilityGiven() throws InvalidValue {
        assertThrows(InvalidValue.class, () -> {
            Probability.create(2);
        });
    }

    @Test
    void calculateProbabilityOfGettingAtleastOneTail() throws InvalidValue {
        Probability p1 = Probability.create(0.25);
        Probability p2 = Probability.create(0.25);

        assertEquals(Probability.create(0.4375), p1.or(p2));
    }
}