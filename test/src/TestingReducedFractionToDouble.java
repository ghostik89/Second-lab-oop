import org.junit.Assert;
import org.junit.jupiter.api.Test;
import reducedfractionapp.ReducedFraction;

public class TestingReducedFractionToDouble {
    @Test()
    void simplyToDouble() {
        ReducedFraction tested = new ReducedFraction(2,4);
        final double waitingValue = 0.5;
        Assert.assertTrue(tested.toDouble() - waitingValue < 0.00001);
    }

    @Test()
    void fromNumber() {
        ReducedFraction tested = new ReducedFraction(2);
        final double waitingValue = 2.0;
        Assert.assertTrue(tested.toDouble() - waitingValue < 0.00001);
    }
}
