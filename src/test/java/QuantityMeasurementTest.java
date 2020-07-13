import QuantityMeasurement.Service.QuantityMeasurement;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
    @Test
    public void givenFeetAndInches_ShouldReturnComparisonResult() {
        Assert.assertEquals(true, QuantityMeasurement.convertFeetToInch(1.0, 12.0));
    }

    @Test
    public void givenFeetAndInches_ShouldReturnComparisonResult_ForNull() {
        Assert.assertEquals(true, QuantityMeasurement.convertFeetToInch(0.0, 0.0));
    }

    @Test
    public void givenYardAndFeet_ShouldReturnComparisonResult() {
        Assert.assertEquals(true, QuantityMeasurement.convertYardToFeet(1.0, 3.0));
    }

    @Test
    public void givenYardAndFeet_ShouldReturnComparisonResult_ForWrongValues() {
        Assert.assertEquals(false, QuantityMeasurement.convertYardToFeet(1.0, 1.0));
    }

    @Test
    public void givenYardAndInches_ShouldReturnComparisonResult_ForWrongValues() {
        Assert.assertEquals(false, QuantityMeasurement.convertYardToInch(1.0, 1.0));
    }

    @Test
    public void givenYardAndInches_ShouldReturnComparisonResult_ForCorrectValues() {
        Assert.assertEquals(true, QuantityMeasurement.convertYardToInch(1.0, 36.0));
    }

    @Test
    public void givenInchesAndYard_ShouldReturnComparisonResult_ForCorrectValues() {
        Assert.assertEquals(true, QuantityMeasurement.convertInchToYard(36.0, 1.0));
    }
}
