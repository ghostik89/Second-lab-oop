import org.junit.Assert;
import org.junit.jupiter.api.Test;
import reducedfractionapp.ReducedFraction;

public class TestingReducedFractionCreatingFromFraction {

    @Test()
    void simplyCreatingNotReducedFraction() {
        ReducedFraction tested = ReducedFraction.createReducedFraction(2,4);
        final ReducedFraction waitingValue = ReducedFraction.createReducedFraction(1,2);

        Assert.assertEquals(tested, waitingValue);
    }

    @Test
    void simplyNegativeCreating() {
        ReducedFraction tested = ReducedFraction.createReducedFraction(-2,4);
        final ReducedFraction waitingValue = ReducedFraction.createReducedFraction(-1,2);

        Assert.assertEquals(tested, waitingValue);
    }

    @Test
    void allNegativeCreating() {
        ReducedFraction tested = ReducedFraction.createReducedFraction(-2,-4);
        final ReducedFraction waitingValue = ReducedFraction.createReducedFraction(1,2);

        Assert.assertEquals(tested, waitingValue);
    }

    @Test
    void primeNumberCreating() {
        ReducedFraction tested = ReducedFraction.createReducedFraction(5,13);
        final ReducedFraction waitingValue = ReducedFraction.createReducedFraction(5,13);

        Assert.assertEquals(tested, waitingValue);
    }

    @Test
    void exceptionForZero() {
        ReducedFraction tested = ReducedFraction.createReducedFraction(5,0);
        final ReducedFraction waitingValue = ReducedFraction.createReducedFraction(0,0);

        Assert.assertEquals(tested, waitingValue);
    }

}