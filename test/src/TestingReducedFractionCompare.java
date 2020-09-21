import org.junit.Assert;
import org.junit.jupiter.api.Test;
import reducedfractionapp.ReducedFraction;

public class TestingReducedFractionCompare {

    @Test()
    void lessCompare() {
        ReducedFraction compared1 = ReducedFraction.createReducedFraction(2,4);
        ReducedFraction compared2 = ReducedFraction.createReducedFraction(2,3);

        Assert.assertTrue(compared1.compare(compared2) < 0);
    }

    @Test()
    void moreCompare() {
        ReducedFraction compared1 = ReducedFraction.createReducedFraction(2,3);
        ReducedFraction compared2 = ReducedFraction.createReducedFraction(2,8);

        Assert.assertTrue(compared1.compare(compared2) > 0);
    }

    @Test()
    void equalCompare() {
        ReducedFraction compared1 = ReducedFraction.createReducedFraction(2,3);
        ReducedFraction compared2 = ReducedFraction.createReducedFraction(2,3);

        Assert.assertEquals(0, compared1.compare(compared2));
    }

    @Test()
    void negativeCompare() {
        ReducedFraction compared1 = ReducedFraction.createReducedFraction(-2,3);
        ReducedFraction compared2 = ReducedFraction.createReducedFraction(2,3);

        Assert.assertTrue(compared1.compare(compared2) < 0);
    }

}
