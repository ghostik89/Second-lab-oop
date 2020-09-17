
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import reducedfractionapp.ReducedFraction;

public class TestingReducedFraction {

    @Test
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
        ReducedFraction tested = ReducedFraction.createReducedFraction(2,4);
        final ReducedFraction waitingValue = ReducedFraction.createReducedFraction(1,2);

        Assert.assertEquals(tested, waitingValue);
    }
}