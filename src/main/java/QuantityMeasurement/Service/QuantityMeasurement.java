package QuantityMeasurement.Service;

import QuantityMeasurement.Utility.QuantityConversion;

public class QuantityMeasurement {

    private static int feetToInchConversionFactor = 12;
    private static double yardToFeetConversionFactor = 3;
    private static double yardToInchConversionFactor = 36;

    public double getConversionValue(double unit, QuantityConversion quantityConversion){
        return unit*quantityConversion.CONVERSION_FACTOR;
    }

}
