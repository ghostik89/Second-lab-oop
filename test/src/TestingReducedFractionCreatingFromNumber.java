import org.junit.Assert;
import org.junit.jupiter.api.Test;
import reducedfractionapp.ReducedFraction;

public class TestingReducedFractionCreatingFromNumber {
    @Test
    void simplyCreatingFractionFromNumber() {
        ReducedFraction tested = new ReducedFraction(23);

        Assert.assertEquals(tested.get_numerator(), 23);
        Assert.assertEquals(tested.get_denominator(), 1);
    }

    @Test
    void simplyCreatingFractionFromNegativeNumber() {
        ReducedFraction tested = new ReducedFraction(-23);

        Assert.assertEquals(tested.get_numerator(), -23);
        Assert.assertEquals(tested.get_denominator(), 1);
    }

    @Test
    void simplyCreatingFractionFromZero() {
        ReducedFraction tested = new ReducedFraction(0);

        Assert.assertEquals(tested.get_numerator(), 0);
        Assert.assertEquals(tested.get_denominator(), 1);
    }
}
