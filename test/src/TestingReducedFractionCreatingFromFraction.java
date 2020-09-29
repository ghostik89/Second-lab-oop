import org.junit.Assert;
import org.junit.jupiter.api.Test;
import reducedfractionapp.ReducedFraction;

public class TestingReducedFractionCreatingFromFraction {

    @Test()
    void simplyCreatingNotReducedFraction() {
        ReducedFraction tested = new ReducedFraction(2,4);

        Assert.assertEquals(tested.get_numerator(), 1);
        Assert.assertEquals(tested.get_denominator(), 2);
    }

    @Test
    void simplyNegativeCreating() {
        ReducedFraction tested = new ReducedFraction(-2,4);

        Assert.assertEquals(tested.get_numerator(), -1);
        Assert.assertEquals(tested.get_denominator(), 2);
    }

    @Test
    void allNegativeCreating() {
        ReducedFraction tested = new ReducedFraction(-2,-4);

        Assert.assertEquals(tested.get_numerator(), 1);
        Assert.assertEquals(tested.get_denominator(), 2);
    }

    @Test
    void primeNumberCreating() {
        ReducedFraction tested = new ReducedFraction(5,13);

        Assert.assertEquals(tested.get_numerator(), 5);
        Assert.assertEquals(tested.get_denominator(), 13);
    }

    @Test
    void exceptionForZero() {
        ReducedFraction tested = new ReducedFraction(5,0);
        final ReducedFraction waitingValue = new ReducedFraction(0,0);

        Assert.assertEquals(tested.get_numerator(), 0);
        Assert.assertEquals(tested.get_denominator(), 0);
    }


    @Test
    void ZeroNumberCreating() {
        ReducedFraction tested = new ReducedFraction(0,1);

        Assert.assertEquals(tested.get_numerator(), 0);
        Assert.assertEquals(tested.get_denominator(), 1);
    }
}