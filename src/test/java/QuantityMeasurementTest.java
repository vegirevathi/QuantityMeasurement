import QuantityMeasurement.Model.Length;
import QuantityMeasurement.Model.Temperature;
import QuantityMeasurement.Model.Volume;
import QuantityMeasurement.Model.Weight;
import QuantityMeasurement.Service.QuantityMeasurement;
import QuantityMeasurement.Utility.QuantityConversion;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAndNull_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = null;
        boolean result = feet1.equals(feet2);
        Assert.assertFalse(result);
    }

    @Test
    public void givenFeet1AndFeet2_FromDifferentTypes_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        String feet2 = "One";
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenFeet1AndFeet2_FromDifferentReferences_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        double feet2 = 0.0;
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        Length Inch1 = new Length(Length.Unit.INCH, 0.0);
        Length Inch2 = new Length(Length.Unit.INCH, 0.0);
        Assert.assertEquals(Inch1, Inch2);
    }

    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEqual() {
        Length Inch1 = new Length(Length.Unit.INCH, 0.0);
        Length Inch2 = new Length(Length.Unit.INCH, 1.0);
        Assert.assertNotEquals(Inch1, Inch2);
    }

    @Test
    public void given0InchAndNull_ShouldReturnNotEqual() {
        Length Inch1 = new Length(Length.Unit.INCH, 0.0);
        Length Inch2 = null;
        Assert.assertNotEquals(Inch1, Inch2);
    }

    @Test
    public void given0InchAndZeroInch_ShouldReturnNotEqual() {
        Length Inch1 = new Length(Length.Unit.INCH, 1.0);
        String Inch2 = "One";
        Assert.assertNotEquals(Inch1, Inch2);
    }

    @Test
    public void given0InchAnd0Inch_FromDifferentClass_ShouldReturnNotEqual() {
        Length Inch1 = new Length(Length.Unit.INCH, 0.0);
        double Inch2 = 0.0;
        Assert.assertNotEquals(Inch1, Inch2);
    }

    @Test
    public void given0YardAnd0Yard_ShouldReturnEqual() {
        Length yard1 = new Length(Length.Unit.YARD, 0.0);
        Length yard2 = new Length(Length.Unit.YARD, 0.0);
        Assert.assertEquals(yard1, yard2);
    }

    @Test
    public void given0YardAnd1Yard_ShouldReturnNotEqual() {
        Length yard1 = new Length(Length.Unit.YARD, 0.0);
        Length yard2 = new Length(Length.Unit.YARD, 1.0);
        Assert.assertNotEquals(yard1, yard2);
    }

    @Test
    public void given0YardAndNull_ShouldReturnNotEqual() {
        Length yard1 = new Length(Length.Unit.YARD, 0.0);
        Length yard2 = null;
        Assert.assertNotEquals(yard1, yard2);
    }

    @Test
    public void given0YardAnd0Yard_ClassChange_ShouldReturnNotEqual() {
        Length yard1 = new Length(Length.Unit.YARD, 0.0);
        double yard2 = 1.0;
        Assert.assertNotEquals(yard1, yard2);
    }

    @Test
    public void given0CentimetersAnd0Centimeters_ShouldReturnEqual() {
        Length centimeter1 = new Length(Length.Unit.CENTIMETER, 0.0);
        Length centimeter2 = new Length(Length.Unit.CENTIMETER, 0.0);
        Assert.assertEquals(centimeter1, centimeter2);
    }

    @Test
    public void given0CentimetersAnd1Centimeters_ShouldReturnNotEqual() {
        Length centimeter1 = new Length(Length.Unit.CENTIMETER, 0.0);
        Length centimeter2 = new Length(Length.Unit.CENTIMETER, 1.0);
        Assert.assertNotEquals(centimeter1, centimeter2);
    }

    @Test
    public void given0CentimetersAndNull_ShouldReturnNotEqual() {
        Length centimeter1 = new Length(Length.Unit.CENTIMETER, 0.0);
        Length centimeter2 = null;
        Assert.assertNotEquals(centimeter1, centimeter2);
    }

    @Test
    public void given0CentimetersAnd1Centimeters_DifferentReference_ShouldReturnNotEqual() {
        Length centimeter1 = new Length(Length.Unit.CENTIMETER, 0.0);
        double centimeter2 = 0.0;
        Assert.assertNotEquals(centimeter1, centimeter2);
    }

    @Test
    public void givenFeetAndInches_WhenLengthsAreEqual_ShouldReturnTrue() {
        Length Inch = new Length(Length.Unit.INCH, 12.0);
        Length feet = new Length(Length.Unit.FEET, 1.0);
        Assert.assertEquals(new QuantityMeasurement().getConversionValue(feet.value, QuantityConversion.FEET_TO_INCH), Inch.value, 0.000);
    }

    @Test
    public void givenFeetAndInches_WhenBothAreZero_ShouldReturnTrue() {
        Length Inch = new Length(Length.Unit.INCH, 0.0);
        Length feet = new Length(Length.Unit.FEET, 0.0);
        Assert.assertEquals(new QuantityMeasurement().getConversionValue(feet.value, QuantityConversion.FEET_TO_INCH), Inch.value, 0.000);
    }

    @Test
    public void givenFeetAndInches_WhenLengthsAreNotEqual_ShouldReturnFalse() {
        Length Inch = new Length(Length.Unit.INCH, 13.0);
        Length feet = new Length(Length.Unit.FEET, 1.2);
        Assert.assertNotEquals(new QuantityMeasurement().getConversionValue(feet.value, QuantityConversion.FEET_TO_INCH), Inch.value, 0.000);
    }

    @Test
    public void givenYardAndFeet_WhenLengthsAreEqual_ShouldReturnTrue() {
        Length yard = new Length(Length.Unit.YARD, 1.0);
        Length feet = new Length(Length.Unit.FEET, 3.0);
        Assert.assertEquals(new QuantityMeasurement().getConversionValue(yard.value, QuantityConversion.YARD_TO_FEET), feet.value, 0.000);
    }

    @Test
    public void givenYardAndFeet_WhenLengthsAreNotEqual_ShouldReturnFalse() {
        Length yard = new Length(Length.Unit.YARD, 1.0);
        Length feet = new Length(Length.Unit.FEET, 2.99);
        Assert.assertNotEquals(new QuantityMeasurement().getConversionValue(yard.value, QuantityConversion.YARD_TO_FEET), feet.value, 0.000);
    }

    @Test
    public void givenYardAndInches_WhenLengthsAreNotEqual_ShouldReturnFalse() {
        Length yard = new Length(Length.Unit.YARD, 1.0);
        Length Inch = new Length(Length.Unit.INCH, 13.0);
        Assert.assertNotEquals(new QuantityMeasurement().getConversionValue(yard.value, QuantityConversion.YARD_TO_INCH), Inch.value, 0.00);
    }

    @Test
    public void givenYardAndInches_WhenLengthsAreEqual_ShouldReturnTrue() {
        Length yard = new Length(Length.Unit.YARD, 1.0);
        Length Inch = new Length(Length.Unit.INCH, 36.0);
        Assert.assertEquals(new QuantityMeasurement().getConversionValue(yard.value, QuantityConversion.YARD_TO_INCH), Inch.value, 0.00);
    }

    @Test
    public void givenInchesAndYard_WhenLengthsAreEqual_ShouldReturnTrue() {
        Length Inch = new Length(Length.Unit.INCH, 36.0);
        Length yard = new Length(Length.Unit.YARD, 1.0);
        Assert.assertEquals(new QuantityMeasurement().getConversionValue(Inch.value, QuantityConversion.INCH_TO_YARD), yard.value, 0.1);
    }

    @Test
    public void givenInchesAndYard_WhenLengthsAreNotEqual_ShouldReturnFalse() {
        Length Inch = new Length(Length.Unit.INCH, 36.0);
        Length yard = new Length(Length.Unit.YARD, 1.2);
        Assert.assertNotEquals(new QuantityMeasurement().getConversionValue(Inch.value, QuantityConversion.INCH_TO_YARD), yard.value, 0.1);
    }

    @Test
    public void givenFeetAndYard_WhenLengthsAreEqual_ShouldReturnTrue() {
        Length feet = new Length(Length.Unit.FEET, 3.0);
        Length yard = new Length(Length.Unit.YARD, 1.0);
        Assert.assertEquals(new QuantityMeasurement().getConversionValue(feet.value, QuantityConversion.FEET_TO_YARD), yard.value, 0.1);
    }

    @Test
    public void givenFeetAndYard_WhenLengthsAreNotEqual_ShouldReturnFalse() {
        Length feet = new Length(Length.Unit.FEET, 79.0);
        Length yard = new Length(Length.Unit.YARD, 21.0);
        Assert.assertNotEquals(new QuantityMeasurement().getConversionValue(feet.value, QuantityConversion.FEET_TO_YARD), yard.value, 0.1);
    }

    @Test
    public void givenInchAndCentimeter_WhenLengthsAreEqual_ShouldReturnTrue() {
        Length inch = new Length(Length.Unit.INCH, 1.0);
        Length centimeter = new Length(Length.Unit.CENTIMETER, 2.5);
        Assert.assertEquals(new QuantityMeasurement().getConversionValue(inch.value, QuantityConversion.INCH_TO_CENTIMETER), centimeter.value, 0.1);
    }

    @Test
    public void given2InchAnd2Inch_WhenEqualTo4Inch_ShouldReturnTrue() {
        Length Inch1 = new Length(Length.Unit.INCH, 2.0);
        Length Inch2 = new Length(Length.Unit.INCH, 2.0);
        Length Inch3 = new Length(Length.Unit.INCH, 4.0);
        Assert.assertEquals(new QuantityMeasurement().addingTwoValues(Inch1.value, Inch2.value), Inch3.value, 0.1);
    }

    @Test
    public void given1FeetAnd2Inch_WhenEqualTo14Inch_ShouldReturnTrue() {
        Length feet = new Length(Length.Unit.FEET, 1.0);
        double inch1 = new QuantityMeasurement().getConversionValue(feet.value, QuantityConversion.FEET_TO_INCH);
        Length inch2 = new Length(Length.Unit.INCH, 2.0);
        Length inch3 = new Length(Length.Unit.INCH, 14.0);
        Assert.assertEquals(new QuantityMeasurement().addingTwoValues(inch1, inch2.value), inch3.value, 0.1);
    }

    @Test
    public void given1FeetAnd1Feet_WhenEqualTo24Inch_ShouldReturnTrue() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        double inch1 = new QuantityMeasurement().getConversionValue(feet1.value, QuantityConversion.FEET_TO_INCH);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        double inch2 = new QuantityMeasurement().getConversionValue(feet2.value, QuantityConversion.FEET_TO_INCH);
        Length inch3 = new Length(Length.Unit.INCH, 24.0);
        Assert.assertEquals(new QuantityMeasurement().addingTwoValues(inch1, inch2), inch3.value, 0.1);
    }

    @Test
    public void given2InchAnd2AndHalfCentimeter_WhenEqualTo3Inch_ShouldReturnTrue() {
        Length inch1 = new Length(Length.Unit.INCH, 2.0);
        Length centimeter2 = new Length(Length.Unit.CENTIMETER, 2.5);
        double inch2 = new QuantityMeasurement().getConversionValue(centimeter2.value, QuantityConversion.CENTIMETER_TO_INCH);
        Length inch3 = new Length(Length.Unit.INCH, 3.0);
        Assert.assertEquals(new QuantityMeasurement().addingTwoValues(inch1.value, inch2), inch3.value, 0.1);
    }

    @Test
    public void given0GallonAnd0Gallon_ShouldReturnEqual() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 0.0);
        Volume gallon2 = new Volume(Volume.Unit.GALLON, 0.0);
        Assert.assertEquals(gallon1, gallon2);
    }

    @Test
    public void given0GallonAnd1Gallon_ShouldReturnNotEqual() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 0.0);
        Volume gallon2 = new Volume(Volume.Unit.GALLON, 1.0);
        Assert.assertNotEquals(gallon1, gallon2);
    }

    @Test
    public void given0GallonAndNull_ShouldReturnNotEqual() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 0.0);
        Volume gallon2 = null;
        Assert.assertNotEquals(gallon1, gallon2);
    }

    @Test
    public void given0GallonAnd0Gallon_FromDifferentClasses_ShouldReturnNotEqual() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 0.0);
        double gallon2 = 0.0;
        Assert.assertNotEquals(gallon1, gallon2);
    }

    @Test
    public void given1GallonAnd3dot78Litres_ShouldReturnEqual() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 1.0);
        Volume litre1 = new Volume(Volume.Unit.LITRE, 3.78);
        Assert.assertEquals(new QuantityMeasurement().getConversionValue(gallon1.value, QuantityConversion.GALLON_TO_LITRE), litre1.value, 0.1);
    }

    @Test
    public void given1LitreAnd1000Millilitres_ShouldReturnEqual() {
        Volume litre1 = new Volume(Volume.Unit.LITRE, 1.0);
        Volume millilitre1 = new Volume(Volume.Unit.MILLILITRE, 1000);
        Assert.assertEquals(new QuantityMeasurement().getConversionValue(litre1.value, QuantityConversion.LITRE_TO_MILLILITRE), millilitre1.value, 0.1);
    }

    @Test
    public void given1gallonAnd3dot78Litres_WhenEqualTo7dot57Litres_ShouldReturnTrue() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 1.0);
        double litre1 = new QuantityMeasurement().getConversionValue(gallon1.value, QuantityConversion.GALLON_TO_LITRE);
        Volume litre2 = new Volume(Volume.Unit.LITRE, 3.78);
        Volume litre3 = new Volume(Volume.Unit.LITRE, 7.57);
        Assert.assertEquals(new QuantityMeasurement().addingTwoValues(litre1, litre2.value), litre3.value, 0.1);
    }

    @Test
    public void given1LitreAnd1000Millilitres_WhenEqualTo2Litres_ShouldReturnEqual() {
        Volume litre1 = new Volume(Volume.Unit.LITRE, 1.0);
        Volume millilitre1 = new Volume(Volume.Unit.MILLILITRE, 1000);
        double litre2 = new QuantityMeasurement().getConversionValue(millilitre1.value, QuantityConversion.MILLILITRE_TO_LITRE);
        Volume litre3 = new Volume(Volume.Unit.LITRE, 2.0);
        Assert.assertEquals(new QuantityMeasurement().addingTwoValues(litre1.value, litre2), litre3.value, 0.1);
    }

    @Test
    public void given0GramAnd0Gram_ShouldReturnEqual() {
        Weight gram1 = new Weight(Weight.Unit.GRAM, 0.0);
        Weight gram2 = new Weight(Weight.Unit.GRAM, 0.0);
        Assert.assertEquals(gram1, gram2);
    }

    @Test
    public void given0GramAnd1Gram_ShouldReturnNotEqual() {
        Weight gram1 = new Weight(Weight.Unit.GRAM, 0.0);
        Weight gram2 = new Weight(Weight.Unit.GRAM, 1.0);
        Assert.assertNotEquals(gram1, gram2);
    }

    @Test
    public void given0GramAndNull_ShouldReturnNotEqual() {
        Weight gram1 = new Weight(Weight.Unit.GRAM, 0.0);
        Weight gram2 = null;
        Assert.assertNotEquals(gram1, gram2);
    }

    @Test
    public void given0GramAnd0Gram_WhenDifferentReference_ShouldReturnNotEqual() {
        Weight gram1 = new Weight(Weight.Unit.GRAM, 0.0);
        double gram2 = 0.0;
        Assert.assertNotEquals(gram1, gram2);
    }

    @Test
    public void given1kilogramAnd1000Gram_ShouldReturnEqual() {
        Weight kilogram1 = new Weight(Weight.Unit.KILOGRAM, 1.0);
        Weight gram1 = new Weight(Weight.Unit.GRAM, 1000.0);
        Assert.assertEquals(new QuantityMeasurement().getConversionValue(kilogram1.value, QuantityConversion.KILOGRAM_TO_GRAM), gram1.value, 0.1);
    }

    @Test
    public void given1TonneAnd1000Kgs_ShouldReturnEqual() {
        Weight tonne1 = new Weight(Weight.Unit.TONNE, 1.0);
        Weight kilogram1 = new Weight(Weight.Unit.KILOGRAM, 1000.0);
        Assert.assertEquals(new QuantityMeasurement().getConversionValue(tonne1.value, QuantityConversion.TONNE_TO_KILOGRAM), kilogram1.value, 0.1);
    }

    @Test
    public void given1TonneAnd1000Grams_WhenEqualTo1001Kgs_ShouldReturnTrue() {
        Weight tonne1 = new Weight(Weight.Unit.TONNE, 1.0);
        double kilogram1 = new QuantityMeasurement().getConversionValue(tonne1.value, QuantityConversion.TONNE_TO_KILOGRAM);
        Weight gram1 = new Weight(Weight.Unit.GRAM, 1000.0);
        double kilogram2 = new QuantityMeasurement().getConversionValue(gram1.value, QuantityConversion.GRAM_TO_KILOGRAM);
        Weight kilogram3 = new Weight(Weight.Unit.KILOGRAM, 1001.0);
        Assert.assertEquals(new QuantityMeasurement().addingTwoValues(kilogram1, kilogram2), kilogram3.value, 0.1);
    }

    @Test
    public void given0CelsiusAnd0Celsius_ShouldReturnEqual() {
        Temperature celsius1 = new Temperature(Temperature.Unit.CELSIUS, 0.0);
        Temperature celsius2 = new Temperature(Temperature.Unit.CELSIUS, 0.0);
        Assert.assertEquals(celsius1, celsius2);
    }

    @Test
    public void given0CelsiusAnd1Celsius_ShouldReturnNotEqual() {
        Temperature celsius1 = new Temperature(Temperature.Unit.CELSIUS, 0.0);
        Temperature celsius2 = new Temperature(Temperature.Unit.CELSIUS, 1.0);
        Assert.assertNotEquals(celsius1, celsius2);
    }

    @Test
    public void given0CelsiusAndNull_ShouldReturnNotEqual() {
        Temperature celsius1 = new Temperature(Temperature.Unit.CELSIUS, 0.0);
        Temperature celsius2 = null;
        Assert.assertNotEquals(celsius1, celsius2);
    }
}
