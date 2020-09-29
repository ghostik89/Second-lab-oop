import org.junit.Assert;
import org.junit.jupiter.api.Test;
import reducedfractionapp.ReducedFraction;

public class TestingReducedFractionCreatingFromFraction {

    @Test()
    void simplyCreatingNotReducedFraction() {
        ReducedFraction tested = new ReducedFraction(2,4);
        final ReducedFraction waitingValue = new ReducedFraction(1,2);

        Assert.assertEquals(tested, waitingValue);
    }

    @Test
    void simplyNegativeCreating() {
        ReducedFraction tested = new ReducedFraction(-2,4);
        final ReducedFraction waitingValue = new ReducedFraction(-1,2);

        Assert.assertEquals(tested, waitingValue);
    }

    @Test
    void allNegativeCreating() {
        ReducedFraction tested = new ReducedFraction(-2,-4);
        final ReducedFraction waitingValue = new ReducedFraction(1,2);

        Assert.assertEquals(tested, waitingValue);
    }

    @Test
    void primeNumberCreating() {
        ReducedFraction tested = new ReducedFraction(5,13);
        final ReducedFraction waitingValue = new ReducedFraction(5,13);

        Assert.assertEquals(tested, waitingValue);
    }

    @Test
    void exceptionForZero() {
        ReducedFraction tested = new ReducedFraction(5,0);
        final ReducedFraction waitingValue = new ReducedFraction(0,0);

        Assert.assertEquals(tested, waitingValue);
    }

}