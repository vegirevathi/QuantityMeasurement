import QuantityMeasurement.Enums.QuantityType;
import QuantityMeasurement.Exception.QuantityException;
import QuantityMeasurement.Model.UnitType;
import QuantityMeasurement.Service.QuantityMeasurement;
import QuantityMeasurement.Utility.QuantityConversion;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() throws QuantityException {
        UnitType feet1 = new UnitType(QuantityType.LENGTH, UnitType.Unit.FEET, 0.0);
        UnitType feet2 = new UnitType(QuantityType.LENGTH, UnitType.Unit.FEET, 0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() throws QuantityException {
        UnitType feet1 = new UnitType(QuantityType.LENGTH, UnitType.Unit.FEET, 0.0);
        UnitType feet2 = new UnitType(QuantityType.LENGTH, UnitType.Unit.FEET, 1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAndNull_ShouldReturnNotEqual() throws QuantityException {
        UnitType feet1 = new UnitType(QuantityType.LENGTH, UnitType.Unit.FEET, 0.0);
        UnitType feet2 = null;
        boolean result = feet1.equals(feet2);
        Assert.assertFalse(result);
    }

    @Test
    public void givenFeet1AndFeet2_FromDifferentTypes_ShouldReturnNotEqual() throws QuantityException {
        UnitType feet1 = new UnitType(QuantityType.LENGTH, UnitType.Unit.FEET, 1.0);
        String feet2 = "One";
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenFeet1AndFeet2_FromDifferentReferences_ShouldReturnNotEqual() throws QuantityException {
        UnitType feet1 = new UnitType(QuantityType.LENGTH, UnitType.Unit.FEET, 0.0);
        double feet2 = 0.0;
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() throws QuantityException {
        UnitType Inch1 = new UnitType(QuantityType.LENGTH, UnitType.Unit.INCH, 0.0);
        UnitType Inch2 = new UnitType(QuantityType.LENGTH, UnitType.Unit.INCH, 0.0);
        Assert.assertEquals(Inch1, Inch2);
    }

    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEqual() throws QuantityException {
        UnitType Inch1 = new UnitType(QuantityType.LENGTH, UnitType.Unit.INCH, 0.0);
        UnitType Inch2 = new UnitType(QuantityType.LENGTH, UnitType.Unit.INCH, 1.0);
        Assert.assertNotEquals(Inch1, Inch2);
    }

    @Test
    public void given0InchAndNull_ShouldReturnNotEqual() throws QuantityException {
        UnitType Inch1 = new UnitType(QuantityType.LENGTH, UnitType.Unit.INCH, 0.0);
        UnitType Inch2 = null;
        Assert.assertNotEquals(Inch1, Inch2);
    }

    @Test
    public void given0InchAndZeroInch_ShouldReturnNotEqual() throws QuantityException {
        UnitType Inch1 = new UnitType(QuantityType.LENGTH, UnitType.Unit.INCH, 1.0);
        String Inch2 = "One";
        Assert.assertNotEquals(Inch1, Inch2);
    }

    @Test
    public void given0InchAnd0Inch_FromDifferentClass_ShouldReturnNotEqual() throws QuantityException {
        UnitType Inch1 = new UnitType(QuantityType.LENGTH, UnitType.Unit.INCH, 0.0);
        double Inch2 = 0.0;
        Assert.assertNotEquals(Inch1, Inch2);
    }

    @Test
    public void given0YardAnd0Yard_ShouldReturnEqual() throws QuantityException {
        UnitType yard1 = new UnitType(QuantityType.LENGTH, UnitType.Unit.YARD, 0.0);
        UnitType yard2 = new UnitType(QuantityType.LENGTH, UnitType.Unit.YARD, 0.0);
        Assert.assertEquals(yard1, yard2);
    }

    @Test
    public void given0YardAnd1Yard_ShouldReturnNotEqual() throws QuantityException {
        UnitType yard1 = new UnitType(QuantityType.LENGTH, UnitType.Unit.YARD, 0.0);
        UnitType yard2 = new UnitType(QuantityType.LENGTH, UnitType.Unit.YARD, 1.0);
        Assert.assertNotEquals(yard1, yard2);
    }

    @Test
    public void given0YardAndNull_ShouldReturnNotEqual() throws QuantityException {
        UnitType yard1 = new UnitType(QuantityType.LENGTH, UnitType.Unit.YARD, 0.0);
        UnitType yard2 = null;
        Assert.assertNotEquals(yard1, yard2);
    }

    @Test
    public void given0YardAnd0Yard_ClassChange_ShouldReturnNotEqual() throws QuantityException {
        UnitType yard1 = new UnitType(QuantityType.LENGTH, UnitType.Unit.YARD, 0.0);
        double yard2 = 1.0;
        Assert.assertNotEquals(yard1, yard2);
    }

    @Test
    public void given0CentimetersAnd0Centimeters_ShouldReturnEqual() throws QuantityException {
        UnitType centimeter1 = new UnitType(QuantityType.LENGTH, UnitType.Unit.CENTIMETER, 0.0);
        UnitType centimeter2 = new UnitType(QuantityType.LENGTH, UnitType.Unit.CENTIMETER, 0.0);
        Assert.assertEquals(centimeter1, centimeter2);
    }

    @Test
    public void given0CentimetersAnd1Centimeters_ShouldReturnNotEqual() throws QuantityException {
        UnitType centimeter1 = new UnitType(QuantityType.LENGTH, UnitType.Unit.CENTIMETER, 0.0);
        UnitType centimeter2 = new UnitType(QuantityType.LENGTH, UnitType.Unit.CENTIMETER, 1.0);
        Assert.assertNotEquals(centimeter1, centimeter2);
    }

    @Test
    public void given0CentimetersAndNull_ShouldReturnNotEqual() throws QuantityException {
        UnitType centimeter1 = new UnitType(QuantityType.LENGTH, UnitType.Unit.CENTIMETER, 0.0);
        UnitType centimeter2 = null;
        Assert.assertNotEquals(centimeter1, centimeter2);
    }

    @Test
    public void given0CentimetersAnd1Centimeters_DifferentReference_ShouldReturnNotEqual() throws QuantityException {
        UnitType centimeter1 = new UnitType(QuantityType.LENGTH, UnitType.Unit.CENTIMETER, 0.0);
        double centimeter2 = 0.0;
        Assert.assertNotEquals(centimeter1, centimeter2);
    }

    @Test
    public void givenCentimetersAnd1Centimeters_DifferentReference_ShouldReturnNotEqual() {
        try {
            UnitType centimeter1 = new UnitType(QuantityType.LENGTH, UnitType.Unit.CENTIMETER, -1.0);
            double centimeter2 = 0.0;
            Assert.assertNotEquals(centimeter1, centimeter2);
        } catch (QuantityException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenFeetAndInches_WhenLengthsAreEqual_ShouldReturnTrue() throws QuantityException {
        UnitType Inch = new UnitType(QuantityType.LENGTH, UnitType.Unit.INCH, 12.0);
        UnitType feet = new UnitType(QuantityType.LENGTH, UnitType.Unit.FEET, 1.0);
        Assert.assertEquals(new QuantityMeasurement().getConversionValue(feet.value, QuantityConversion.FEET_TO_INCH), Inch.value, 0.000);
    }

    @Test
    public void givenFeetAndInches_WhenBothAreZero_ShouldReturnTrue() throws QuantityException {
        UnitType Inch = new UnitType(QuantityType.LENGTH, UnitType.Unit.INCH, 0.0);
        UnitType feet = new UnitType(QuantityType.LENGTH, UnitType.Unit.FEET, 0.0);
        Assert.assertEquals(new QuantityMeasurement().getConversionValue(feet.value, QuantityConversion.FEET_TO_INCH), Inch.value, 0.000);
    }

    @Test
    public void givenFeetAndInches_WhenLengthsAreNotEqual_ShouldReturnFalse() throws QuantityException {
        UnitType Inch = new UnitType(QuantityType.LENGTH, UnitType.Unit.INCH, 13.0);
        UnitType feet = new UnitType(QuantityType.LENGTH, UnitType.Unit.FEET, 1.2);
        Assert.assertNotEquals(new QuantityMeasurement().getConversionValue(feet.value, QuantityConversion.FEET_TO_INCH), Inch.value, 0.000);
    }

    @Test
    public void givenYardAndFeet_WhenLengthsAreEqual_ShouldReturnTrue() throws QuantityException {
        UnitType yard = new UnitType(QuantityType.LENGTH, UnitType.Unit.YARD, 1.0);
        UnitType feet = new UnitType(QuantityType.LENGTH, UnitType.Unit.FEET, 3.0);
        Assert.assertEquals(new QuantityMeasurement().getConversionValue(yard.value, QuantityConversion.YARD_TO_FEET), feet.value, 0.000);
    }

    @Test
    public void givenYardAndFeet_WhenLengthsAreNotEqual_ShouldReturnFalse() throws QuantityException {
        UnitType yard = new UnitType(QuantityType.LENGTH, UnitType.Unit.YARD, 1.0);
        UnitType feet = new UnitType(QuantityType.LENGTH, UnitType.Unit.FEET, 2.99);
        Assert.assertNotEquals(new QuantityMeasurement().getConversionValue(yard.value, QuantityConversion.YARD_TO_FEET), feet.value, 0.000);
    }

    @Test
    public void givenYardAndInches_WhenLengthsAreNotEqual_ShouldReturnFalse() throws QuantityException {
        UnitType yard = new UnitType(QuantityType.LENGTH, UnitType.Unit.YARD, 1.0);
        UnitType Inch = new UnitType(QuantityType.LENGTH, UnitType.Unit.INCH, 13.0);
        Assert.assertNotEquals(new QuantityMeasurement().getConversionValue(yard.value, QuantityConversion.YARD_TO_INCH), Inch.value, 0.00);
    }

    @Test
    public void givenYardAndInches_WhenLengthsAreEqual_ShouldReturnTrue() throws QuantityException {
        UnitType yard = new UnitType(QuantityType.LENGTH, UnitType.Unit.YARD, 1.0);
        UnitType Inch = new UnitType(QuantityType.LENGTH, UnitType.Unit.INCH, 36.0);
        Assert.assertEquals(new QuantityMeasurement().getConversionValue(yard.value, QuantityConversion.YARD_TO_INCH), Inch.value, 0.00);
    }

    @Test
    public void givenInchesAndYard_WhenLengthsAreEqual_ShouldReturnTrue() throws QuantityException {
        UnitType Inch = new UnitType(QuantityType.LENGTH, UnitType.Unit.INCH, 36.0);
        UnitType yard = new UnitType(QuantityType.LENGTH, UnitType.Unit.YARD, 1.0);
        Assert.assertEquals(new QuantityMeasurement().getConversionValue(Inch.value, QuantityConversion.INCH_TO_YARD), yard.value, 0.1);
    }

    @Test
    public void givenInchesAndYard_WhenLengthsAreNotEqual_ShouldReturnFalse() throws QuantityException {
        UnitType Inch = new UnitType(QuantityType.LENGTH, UnitType.Unit.INCH, 36.0);
        UnitType yard = new UnitType(QuantityType.LENGTH, UnitType.Unit.YARD, 1.2);
        Assert.assertNotEquals(new QuantityMeasurement().getConversionValue(Inch.value, QuantityConversion.INCH_TO_YARD), yard.value, 0.1);
    }

    @Test
    public void givenFeetAndYard_WhenLengthsAreEqual_ShouldReturnTrue() throws QuantityException {
        UnitType feet = new UnitType(QuantityType.LENGTH, UnitType.Unit.FEET, 3.0);
        UnitType yard = new UnitType(QuantityType.LENGTH, UnitType.Unit.YARD, 1.0);
        Assert.assertEquals(new QuantityMeasurement().getConversionValue(feet.value, QuantityConversion.FEET_TO_YARD), yard.value, 0.1);
    }

    @Test
    public void givenFeetAndYard_WhenLengthsAreNotEqual_ShouldReturnFalse() throws QuantityException {
        UnitType feet = new UnitType(QuantityType.LENGTH, UnitType.Unit.FEET, 79.0);
        UnitType yard = new UnitType(QuantityType.LENGTH, UnitType.Unit.YARD, 21.0);
        Assert.assertNotEquals(new QuantityMeasurement().getConversionValue(feet.value, QuantityConversion.FEET_TO_YARD), yard.value, 0.1);
    }

    @Test
    public void givenInchAndCentimeter_WhenLengthsAreEqual_ShouldReturnTrue() throws QuantityException {
        UnitType inch = new UnitType(QuantityType.LENGTH, UnitType.Unit.INCH, 1.0);
        UnitType centimeter = new UnitType(QuantityType.LENGTH, UnitType.Unit.CENTIMETER, 2.5);
        Assert.assertEquals(new QuantityMeasurement().getConversionValue(inch.value, QuantityConversion.INCH_TO_CENTIMETER), centimeter.value, 0.1);
    }

    @Test
    public void given2InchAnd2Inch_WhenEqualTo4Inch_ShouldReturnTrue() throws QuantityException {
        UnitType Inch1 = new UnitType(QuantityType.LENGTH, UnitType.Unit.INCH, 2.0);
        UnitType Inch2 = new UnitType(QuantityType.LENGTH, UnitType.Unit.INCH, 2.0);
        UnitType Inch3 = new UnitType(QuantityType.LENGTH, UnitType.Unit.INCH, 4.0);
        Assert.assertEquals(new QuantityMeasurement().addingTwoValues(Inch1.value, Inch2.value), Inch3.value, 0.1);
    }

    @Test
    public void given1FeetAnd2Inch_WhenEqualTo14Inch_ShouldReturnTrue() throws QuantityException {
        UnitType feet = new UnitType(QuantityType.LENGTH, UnitType.Unit.FEET, 1.0);
        double inch1 = new QuantityMeasurement().getConversionValue(feet.value, QuantityConversion.FEET_TO_INCH);
        UnitType inch2 = new UnitType(QuantityType.LENGTH, UnitType.Unit.INCH, 2.0);
        UnitType inch3 = new UnitType(QuantityType.LENGTH, UnitType.Unit.INCH, 14.0);
        Assert.assertEquals(new QuantityMeasurement().addingTwoValues(inch1, inch2.value), inch3.value, 0.1);
    }

    @Test
    public void given1FeetAnd1Feet_WhenEqualTo24Inch_ShouldReturnTrue() throws QuantityException {
        UnitType feet1 = new UnitType(QuantityType.LENGTH, UnitType.Unit.FEET, 1.0);
        double inch1 = new QuantityMeasurement().getConversionValue(feet1.value, QuantityConversion.FEET_TO_INCH);
        UnitType feet2 = new UnitType(QuantityType.LENGTH, UnitType.Unit.FEET, 1.0);
        double inch2 = new QuantityMeasurement().getConversionValue(feet2.value, QuantityConversion.FEET_TO_INCH);
        UnitType inch3 = new UnitType(QuantityType.LENGTH, UnitType.Unit.INCH, 24.0);
        Assert.assertEquals(new QuantityMeasurement().addingTwoValues(inch1, inch2), inch3.value, 0.1);
    }

    @Test
    public void given2InchAnd2AndHalfCentimeter_WhenEqualTo3Inch_ShouldReturnTrue() throws QuantityException {
        UnitType inch1 = new UnitType(QuantityType.LENGTH, UnitType.Unit.INCH, 2.0);
        UnitType centimeter2 = new UnitType(QuantityType.LENGTH, UnitType.Unit.CENTIMETER, 2.5);
        double inch2 = new QuantityMeasurement().getConversionValue(centimeter2.value, QuantityConversion.CENTIMETER_TO_INCH);
        UnitType inch3 = new UnitType(QuantityType.LENGTH, UnitType.Unit.INCH, 3.0);
        Assert.assertEquals(new QuantityMeasurement().addingTwoValues(inch1.value, inch2), inch3.value, 0.1);
    }

    @Test
    public void given0GallonAnd0Gallon_ShouldReturnEqual() throws QuantityException {
        UnitType gallon1 = new UnitType(QuantityType.VOLUME, UnitType.Unit.GALLON, 0.0);
        UnitType gallon2 = new UnitType(QuantityType.VOLUME, UnitType.Unit.GALLON, 0.0);
        Assert.assertEquals(gallon1, gallon2);
    }

    @Test
    public void given0GallonAnd1Gallon_ShouldReturnNotEqual() throws QuantityException {
        UnitType gallon1 = new UnitType(QuantityType.VOLUME, UnitType.Unit.GALLON, 0.0);
        UnitType gallon2 = new UnitType(QuantityType.VOLUME, UnitType.Unit.GALLON, 1.0);
        Assert.assertNotEquals(gallon1, gallon2);
    }

    @Test
    public void given0GallonAndNull_ShouldReturnNotEqual() throws QuantityException {
        UnitType gallon1 = new UnitType(QuantityType.VOLUME, UnitType.Unit.GALLON, 0.0);
        UnitType gallon2 = null;
        Assert.assertNotEquals(gallon1, gallon2);
    }

    @Test
    public void given0GallonAnd0Gallon_FromDifferentClasses_ShouldReturnNotEqual() throws QuantityException {
        UnitType gallon1 = new UnitType(QuantityType.VOLUME, UnitType.Unit.GALLON, 0.0);
        double gallon2 = 0.0;
        Assert.assertNotEquals(gallon1, gallon2);
    }

    @Test
    public void given1GallonAnd3dot78Litres_ShouldReturnEqual() throws QuantityException {
        UnitType gallon1 = new UnitType(QuantityType.VOLUME, UnitType.Unit.GALLON, 1.0);
        UnitType litre1 = new UnitType(QuantityType.VOLUME, UnitType.Unit.LITRE, 3.78);
        Assert.assertEquals(new QuantityMeasurement().getConversionValue(gallon1.value, QuantityConversion.GALLON_TO_LITRE), litre1.value, 0.1);
    }

    @Test
    public void given1LitreAnd1000Millilitres_ShouldReturnEqual() throws QuantityException {
        UnitType litre1 = new UnitType(QuantityType.VOLUME, UnitType.Unit.LITRE, 1.0);
        UnitType millilitre1 = new UnitType(QuantityType.VOLUME, UnitType.Unit.MILLILITRE, 1000);
        Assert.assertEquals(new QuantityMeasurement().getConversionValue(litre1.value, QuantityConversion.LITRE_TO_MILLILITRE), millilitre1.value, 0.1);
    }

    @Test
    public void given1gallonAnd3dot78Litres_WhenEqualTo7dot57Litres_ShouldReturnTrue() throws QuantityException {
        UnitType gallon1 = new UnitType(QuantityType.VOLUME, UnitType.Unit.GALLON, 1.0);
        double litre1 = new QuantityMeasurement().getConversionValue(gallon1.value, QuantityConversion.GALLON_TO_LITRE);
        UnitType litre2 = new UnitType(QuantityType.VOLUME, UnitType.Unit.LITRE, 3.78);
        UnitType litre3 = new UnitType(QuantityType.VOLUME, UnitType.Unit.LITRE, 7.57);
        Assert.assertEquals(new QuantityMeasurement().addingTwoValues(litre1, litre2.value), litre3.value, 0.1);
    }

    @Test
    public void given1LitreAnd1000Millilitres_WhenEqualTo2Litres_ShouldReturnEqual() throws QuantityException {
        UnitType litre1 = new UnitType(QuantityType.VOLUME, UnitType.Unit.LITRE, 1.0);
        UnitType millilitre1 = new UnitType(QuantityType.VOLUME, UnitType.Unit.MILLILITRE, 1000);
        double litre2 = new QuantityMeasurement().getConversionValue(millilitre1.value, QuantityConversion.MILLILITRE_TO_LITRE);
        UnitType litre3 = new UnitType(QuantityType.VOLUME, UnitType.Unit.LITRE, 2.0);
        Assert.assertEquals(new QuantityMeasurement().addingTwoValues(litre1.value, litre2), litre3.value, 0.1);
    }

    @Test
    public void given0GramAnd0Gram_ShouldReturnEqual() throws QuantityException {
        UnitType gram1 = new UnitType(QuantityType.WEIGHT, UnitType.Unit.GRAM, 0.0);
        UnitType gram2 = new UnitType(QuantityType.WEIGHT, UnitType.Unit.GRAM, 0.0);
        Assert.assertEquals(gram1, gram2);
    }

    @Test
    public void given0GramAnd1Gram_ShouldReturnNotEqual() throws QuantityException {
        UnitType gram1 = new UnitType(QuantityType.WEIGHT, UnitType.Unit.GRAM, 0.0);
        UnitType gram2 = new UnitType(QuantityType.WEIGHT, UnitType.Unit.GRAM, 1.0);
        Assert.assertNotEquals(gram1, gram2);
    }

    @Test
    public void given0GramAndNull_ShouldReturnNotEqual() throws QuantityException {
        UnitType gram1 = new UnitType(QuantityType.WEIGHT, UnitType.Unit.GRAM, 0.0);
        UnitType gram2 = null;
        Assert.assertNotEquals(gram1, gram2);
    }

    @Test
    public void given0GramAnd0Gram_WhenDifferentReference_ShouldReturnNotEqual() throws QuantityException {
        UnitType gram1 = new UnitType(QuantityType.WEIGHT, UnitType.Unit.GRAM, 0.0);
        double gram2 = 0.0;
        Assert.assertNotEquals(gram1, gram2);
    }

    @Test
    public void given1kilogramAnd1000Gram_ShouldReturnEqual() throws QuantityException {
        UnitType kilogram1 = new UnitType(QuantityType.WEIGHT, UnitType.Unit.KILOGRAM, 1.0);
        UnitType gram1 = new UnitType(QuantityType.WEIGHT, UnitType.Unit.GRAM, 1000.0);
        Assert.assertEquals(new QuantityMeasurement().getConversionValue(kilogram1.value, QuantityConversion.KILOGRAM_TO_GRAM), gram1.value, 0.1);
    }

    @Test
    public void given1TonneAnd1000Kgs_ShouldReturnEqual() throws QuantityException {
        UnitType tonne1 = new UnitType(QuantityType.WEIGHT, UnitType.Unit.TONNE, 1.0);
        UnitType kilogram1 = new UnitType(QuantityType.WEIGHT, UnitType.Unit.KILOGRAM, 1000.0);
        Assert.assertEquals(new QuantityMeasurement().getConversionValue(tonne1.value, QuantityConversion.TONNE_TO_KILOGRAM), kilogram1.value, 0.1);
    }

    @Test
    public void given1TonneAnd1000Grams_WhenEqualTo1001Kgs_ShouldReturnTrue() throws QuantityException {
        UnitType tonne1 = new UnitType(QuantityType.WEIGHT, UnitType.Unit.TONNE, 1.0);
        double kilogram1 = new QuantityMeasurement().getConversionValue(tonne1.value, QuantityConversion.TONNE_TO_KILOGRAM);
        UnitType gram1 = new UnitType(QuantityType.WEIGHT, UnitType.Unit.GRAM, 1000.0);
        double kilogram2 = new QuantityMeasurement().getConversionValue(gram1.value, QuantityConversion.GRAM_TO_KILOGRAM);
        UnitType kilogram3 = new UnitType(QuantityType.WEIGHT, UnitType.Unit.KILOGRAM, 1001.0);
        Assert.assertEquals(new QuantityMeasurement().addingTwoValues(kilogram1, kilogram2), kilogram3.value, 0.1);
    }

    @Test
    public void given0CelsiusAnd0Celsius_ShouldReturnEqual() throws QuantityException {
        UnitType celsius1 = new UnitType(QuantityType.TEMPERATURE, UnitType.Unit.CELSIUS, 0.0);
        UnitType celsius2 = new UnitType(QuantityType.TEMPERATURE, UnitType.Unit.CELSIUS, 0.0);
        Assert.assertEquals(celsius1, celsius2);
    }

    @Test
    public void given0CelsiusAnd1Celsius_ShouldReturnNotEqual() throws QuantityException {
        UnitType celsius1 = new UnitType(QuantityType.TEMPERATURE, UnitType.Unit.CELSIUS, 0.0);
        UnitType celsius2 = new UnitType(QuantityType.TEMPERATURE, UnitType.Unit.CELSIUS, 1.0);
        Assert.assertNotEquals(celsius1, celsius2);
    }

    @Test
    public void given0CelsiusAndNull_ShouldReturnNotEqual() throws QuantityException {
        UnitType celsius1 = new UnitType(QuantityType.TEMPERATURE, UnitType.Unit.CELSIUS, 0.0);
        UnitType celsius2 = null;
        Assert.assertNotEquals(celsius1, celsius2);
    }

    @Test
    public void given0CelsiusAnd0Celsius_WhenReferenceDifferent_ShouldReturnNotEqual() throws QuantityException {
        UnitType celsius1 = new UnitType(QuantityType.TEMPERATURE, UnitType.Unit.CELSIUS, 0.0);
        double celsius2 = 0.0;
        Assert.assertNotEquals(celsius1, celsius2);
    }

    @Test
    public void given100CelsiusAnd212Fahrenheit_ShouldReturnEqual() throws QuantityException {
        UnitType celsius1 = new UnitType(QuantityType.TEMPERATURE, UnitType.Unit.CELSIUS, 100.0);
        UnitType fahrenheit1 = new UnitType(QuantityType.TEMPERATURE, UnitType.Unit.FAHRENHEIT, 212.0);
        Assert.assertEquals(new QuantityMeasurement().temperatureConversion(celsius1.value, 32, QuantityConversion.CELSIUS_TO_FAHRENHEIT), fahrenheit1.value, 0.1);
    }
}
