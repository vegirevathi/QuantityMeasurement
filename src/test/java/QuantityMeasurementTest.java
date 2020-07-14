import QuantityMeasurement.Model.Centimeter;
import QuantityMeasurement.Model.Feet;
import QuantityMeasurement.Model.Inch;
import QuantityMeasurement.Model.Yard;
import QuantityMeasurement.Service.QuantityMeasurement;
import QuantityMeasurement.Utility.QuantityConversion;
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
        Feet feet2 = new Feet("One");
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
    public void given0InchAnd1Inch_ShouldReturnNotEqual() {
        Inch Inch1 = new Inch(0.0);
        Inch Inch2 = new Inch(1.0);
        Assert.assertNotEquals(Inch1, Inch2);
    }

    @Test
    public void given0InchAndNull_ShouldReturnNotEqual() {
        Inch Inch1 = new Inch(0.0);
        Inch Inch2 = null;
        Assert.assertNotEquals(Inch1, Inch2);
    }

    @Test
    public void given0InchAndZeroInch_ShouldReturnNotEqual() {
        Inch Inch1 = new Inch(1.0);
        Inch Inch2 = new Inch("One");
        Assert.assertNotEquals(Inch1, Inch2);
    }

    @Test
    public void given0InchAnd0Inch_FromDifferentClass_ShouldReturnNotEqual() {
        Inch Inch1 = new Inch(0.0);
        double Inch2 = 0.0;
        Assert.assertNotEquals(Inch1, Inch2);
    }

    @Test
    public void given0YardAnd0Yard_ShouldReturnEqual() {
        Yard yard1 = new Yard(0.0);
        Yard yard2 = new Yard(0.0);
        Assert.assertEquals(yard1, yard2);
    }

    @Test
    public void given0YardAnd1Yard_ShouldReturnNotEqual() {
        Yard yard1 = new Yard(0.0);
        Yard yard2 = new Yard(1.0);
        Assert.assertNotEquals(yard1, yard2);
    }

    @Test
    public void given0YardAndNull_ShouldReturnNotEqual() {
        Yard yard1 = new Yard(0.0);
        Yard yard2 = null;
        Assert.assertNotEquals(yard1, yard2);
    }

    @Test
    public void given0YardAnd0Yard_ClassChange_ShouldReturnNotEqual() {
        Yard yard1 = new Yard(0.0);
        double yard2 = 1.0;
        Assert.assertNotEquals(yard1, yard2);
    }

    @Test
    public void given0CentimetersAnd0Centimeters_ShouldReturnEqual() {
        Centimeter centimeter1 = new Centimeter(0.0);
        Centimeter centimeter2 = new Centimeter(0.0);
        Assert.assertEquals(centimeter1, centimeter2);
    }

    @Test
    public void given0CentimetersAnd1Centimeters_ShouldReturnNotEqual() {
        Centimeter centimeter1 = new Centimeter(0.0);
        Centimeter centimeter2 = new Centimeter(1.0);
        Assert.assertNotEquals(centimeter1, centimeter2);
    }

    @Test
    public void given0CentimetersAndNull_ShouldReturnNotEqual() {
        Centimeter centimeter1 = new Centimeter(0.0);
        Centimeter centimeter2 = null;
        Assert.assertNotEquals(centimeter1, centimeter2);
    }

    @Test
    public void given0CentimetersAnd1Centimeters_DifferentReference_ShouldReturnNotEqual() {
        Centimeter centimeter1 = new Centimeter(0.0);
        double centimeter2 = 0.0;
        Assert.assertNotEquals(centimeter1, centimeter2);
    }

    @Test
    public void givenFeetAndInches_WhenLengthsAreEqual_ShouldReturnTrue() {
        Inch Inch = new Inch(12.0);
        Feet feet = new Feet(1.0);
        Assert.assertEquals(new QuantityMeasurement().getConversionValue(feet.value, QuantityConversion.FEET_TO_INCH), Inch.value, 0.000);
    }

    @Test
    public void givenFeetAndInches_WhenBothAreZero_ShouldReturnTrue() {
        Inch Inch = new Inch(0.0);
        Feet feet = new Feet(0.0);
        Assert.assertEquals(new QuantityMeasurement().getConversionValue(feet.value, QuantityConversion.FEET_TO_INCH), Inch.value, 0.000);
    }

    @Test
    public void givenFeetAndInches_WhenLengthsAreNotEqual_ShouldReturnFalse() {
        Inch Inch = new Inch(13.0);
        Feet feet = new Feet(1.2);
        Assert.assertNotEquals(new QuantityMeasurement().getConversionValue(feet.value, QuantityConversion.FEET_TO_INCH), Inch.value, 0.000);
    }

    @Test
    public void givenYardAndFeet_WhenLengthsAreEqual_ShouldReturnTrue() {
        Yard yard = new Yard(1.0);
        Feet feet = new Feet(3.0);
        Assert.assertEquals(new QuantityMeasurement().getConversionValue(yard.value, QuantityConversion.YARD_TO_FEET), feet.value, 0.000);
    }

    @Test
    public void givenYardAndFeet_WhenLengthsAreNotEqual_ShouldReturnFalse() {
        Yard yard = new Yard(1.0);
        Feet feet = new Feet(2.99);
        Assert.assertNotEquals(new QuantityMeasurement().getConversionValue(yard.value, QuantityConversion.YARD_TO_FEET), feet.value, 0.000);
    }

    @Test
    public void givenYardAndInches_WhenLengthsAreNotEqual_ShouldReturnFalse() {
        Yard yard = new Yard(1.0);
        Inch Inch = new Inch(13.0);
        Assert.assertNotEquals(new QuantityMeasurement().getConversionValue(yard.value, QuantityConversion.YARD_TO_INCH), Inch.value, 0.00);
    }

    @Test
    public void givenYardAndInches_WhenLengthsAreEqual_ShouldReturnTrue() {
        Yard yard = new Yard(1.0);
        Inch Inch = new Inch(36.0);
        Assert.assertEquals(new QuantityMeasurement().getConversionValue(yard.value, QuantityConversion.YARD_TO_INCH), Inch.value, 0.00);
    }

    @Test
    public void givenInchesAndYard_WhenLengthsAreEqual_ShouldReturnTrue() {
        Inch Inch = new Inch(36.0);
        Yard yard = new Yard(1.0);
        Assert.assertEquals(new QuantityMeasurement().getConversionValue(Inch.value, QuantityConversion.INCH_TO_YARD), yard.value, 0.1);
    }

    @Test
    public void givenInchesAndYard_WhenLengthsAreNotEqual_ShouldReturnFalse() {
        Inch Inch = new Inch(36.0);
        Yard yard = new Yard(1.2);
        Assert.assertNotEquals(new QuantityMeasurement().getConversionValue(Inch.value, QuantityConversion.INCH_TO_YARD), yard.value, 0.1);
    }

    @Test
    public void givenFeetAndYard_WhenLengthsAreEqual_ShouldReturnTrue() {
        Feet feet = new Feet(3.0);
        Yard yard = new Yard(1.0);
        Assert.assertEquals(new QuantityMeasurement().getConversionValue(feet.value, QuantityConversion.FEET_TO_YARD), yard.value, 0.1);
    }

    @Test
    public void givenFeetAndYard_WhenLengthsAreNotEqual_ShouldReturnFalse() {
        Feet feet = new Feet(79.0);
        Yard yard = new Yard(21.0);
        Assert.assertNotEquals(new QuantityMeasurement().getConversionValue(feet.value, QuantityConversion.FEET_TO_YARD), yard.value, 0.1);
    }

    @Test
    public void givenInchAndCentimeter_WhenLengthsAreEqual_ShouldReturnTrue() {
        Inch inch = new Inch(1.0);
        Centimeter centimeter = new Centimeter(2.5);
        Assert.assertEquals(new QuantityMeasurement().getConversionValue(inch.value, QuantityConversion.INCH_TO_CENTIMETER), centimeter.value, 0.1);
    }
}
