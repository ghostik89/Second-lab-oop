import org.junit.Assert;
import org.junit.jupiter.api.Test;
import reducedfractionapp.ReducedFraction;

public class TestingReducedFractionMultiply {
    @Test
    void multiplyFractionWithoutClass() {
        ReducedFraction tested1 = ReducedFraction.createReducedFraction(2,4);
        ReducedFraction multiplyed = tested1.multiply(2,4);
        final ReducedFraction waitingValue = ReducedFraction.createReducedFraction(1,4);

        Assert.assertEquals(multiplyed, waitingValue);
    }

    @Test
    void multiplyFraction() {
        ReducedFraction tested1 = ReducedFraction.createReducedFraction(2,4);
        ReducedFraction tested2 = ReducedFraction.createReducedFraction(2,4);
        ReducedFraction multiplyed = tested1.multiply(tested2);
        final ReducedFraction waitingValue = ReducedFraction.createReducedFraction(1,4);

        Assert.assertEquals(multiplyed, waitingValue);
    }

    @Test
    void multiplyNegativeFraction() {
        ReducedFraction tested1 = ReducedFraction.createReducedFraction(-2,4);
        ReducedFraction tested2 = ReducedFraction.createReducedFraction(2,4);
        ReducedFraction multiplyed = tested1.multiply(tested2);
        final ReducedFraction waitingValue = ReducedFraction.createReducedFraction(-1,4);

        Assert.assertEquals(multiplyed, waitingValue);
    }

    @Test
    void multiplyShadowNonNegativeFraction() {
        ReducedFraction tested1 = ReducedFraction.createReducedFraction(-2,-4);
        ReducedFraction tested2 = ReducedFraction.createReducedFraction(2,4);
        ReducedFraction multiplyed = tested1.multiply(tested2);
        final ReducedFraction waitingValue = ReducedFraction.createReducedFraction(1,4);

        Assert.assertEquals(multiplyed, waitingValue);
    }
}