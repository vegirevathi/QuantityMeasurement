import QuantityMeasurement.Service.QuantityMeasurement;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
    @Test
    public void givenValuesInFeet_ShouldReturnCorrectValueInInches() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double feet = 2.0;
        double inches = quantityMeasurement.convertFeetToInch(feet);
        Assert.assertEquals(24, inches, 0.0);
    }
}
