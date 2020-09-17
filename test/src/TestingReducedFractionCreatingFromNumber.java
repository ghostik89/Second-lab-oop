import org.junit.Assert;
import org.junit.jupiter.api.Test;
import reducedfractionapp.ReducedFraction;

public class TestingReducedFractionCreatingFromNumber {
    @Test
    void simplyCreatingFractionFromNumber() {
        ReducedFraction tested = ReducedFraction.createReducedFractionFromNumber(23);
        final ReducedFraction waitingValue = ReducedFraction.createReducedFraction(23,1);

        Assert.assertEquals(tested, waitingValue);
    }

    @Test
    void simplyCreatingFractionFromNegativeNumber() {
        ReducedFraction tested = ReducedFraction.createReducedFractionFromNumber(-23);
        final ReducedFraction waitingValue = ReducedFraction.createReducedFraction(-23,1);

        Assert.assertEquals(tested, waitingValue);
    }
}
