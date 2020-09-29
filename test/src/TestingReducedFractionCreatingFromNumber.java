import org.junit.Assert;
import org.junit.jupiter.api.Test;
import reducedfractionapp.ReducedFraction;

public class TestingReducedFractionCreatingFromNumber {
    @Test
    void simplyCreatingFractionFromNumber() {
        ReducedFraction tested = new ReducedFraction(23);
        final ReducedFraction waitingValue = new ReducedFraction(23,1);

        Assert.assertEquals(tested, waitingValue);
    }

    @Test
    void simplyCreatingFractionFromNegativeNumber() {
        ReducedFraction tested = new ReducedFraction(-23);
        final ReducedFraction waitingValue = new ReducedFraction(-23,1);

        Assert.assertEquals(tested, waitingValue);
    }
}
