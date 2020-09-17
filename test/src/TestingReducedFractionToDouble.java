import org.junit.Assert;
import org.junit.jupiter.api.Test;
import reducedfractionapp.ReducedFraction;

public class TestingReducedFractionToDouble {
    @Test()
    void simplyCompare() {
        ReducedFraction tested = ReducedFraction.createReducedFraction(2,4);
        final double waitingValue = 0.5;

        Assert.assertTrue(tested.toDouble() - waitingValue < 0.00001);
    }
}
