import QuantityMeasurement.Model.Feet;
import QuantityMeasurement.Model.Inch;
import QuantityMeasurement.Service.QuantityMeasurement;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAndNull_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = null;
        boolean result = feet1.equals(feet2);
        Assert.assertFalse(result);
    }

    @Test
    public void givenFeet1AndFeet2_FromDifferentTypes_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(1.0);
        Feet feet2 = new Feet("Zero");
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenFeet1AndFeet2_FromDifferentReferences_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        double feet2 = 0.0;      
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        Inch Inch1 = new Inch(0.0);
        Inch Inch2 = new Inch(0.0);
        Assert.assertEquals(Inch1, Inch2);
    }

    @Test
    public void givenFeetAndInches_ShouldReturnComparisonResult() {
        Assert.assertEquals(true, QuantityMeasurement.convertFeetToInch(1.0, 12.0));
    }

    @Test
    public void givenFeetAndInches_ShouldReturnComparisonResult_ForNull() {
        Assert.assertEquals(true, QuantityMeasurement.convertFeetToInch(0.0, 0.0));
    }

    @Test
    public void givenFeetAndInches_ShouldReturnComparisonResult_ForWrongValues() {
        Assert.assertEquals(false, QuantityMeasurement.convertFeetToInch(0.1, 1.0));
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

    @Test
    public void givenInchesAndYard_ShouldReturnComparisonResult_ForWrongValues() {
        Assert.assertEquals(false, QuantityMeasurement.convertInchToYard(36.0, 1.1));
    }

    @Test
    public void givenFeetAndYard_ShouldReturnComparisonResult() {
        Assert.assertEquals(true, QuantityMeasurement.convertFeetToYard(3.0, 1.0));
    }

    @Test
    public void givenFeetAndYard_ShouldReturnComparisonResult_ForWrongValues() {
        Assert.assertEquals(false, QuantityMeasurement.convertFeetToYard(3.0, 3.0));
    }
}
