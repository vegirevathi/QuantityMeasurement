package QuantityMeasurement.Service;

import QuantityMeasurement.Utility.QuantityConversion;

public class QuantityMeasurement {

    public double getConversionValue(double unit, QuantityConversion quantityConversion){
        return unit*quantityConversion.CONVERSION_FACTOR;
    }

    public double addingTwoValues(double unit1, double unit2) {
        return unit1+unit2;
    }

    public double temperatureConversion(double unit, double value, QuantityConversion quantityConversion) {
        return (unit)*quantityConversion.CONVERSION_FACTOR + value;
    }
}
