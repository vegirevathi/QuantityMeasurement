import QuantityMeasurement.Service.QuantityMeasurement;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
    @Test
    public void givenValuesInFeet_ShouldReturnCorrectValueInInches() {
        Assert.assertEquals(true, QuantityMeasurement.convertFeetToInch(1.0, 12.0));
    }
}
