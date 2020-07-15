package QuantityMeasurement.Service;

import QuantityMeasurement.Utility.QuantityConversion;

public class QuantityMeasurement {

    /**
     *
     * @param unit
     * @param quantityConversion
     * @return
     */

    public double getConversionValue(double unit, QuantityConversion quantityConversion){
        return unit*quantityConversion.CONVERSION_FACTOR;
    }

    public double addingTwoValues(double unit1, double unit2) {
        return unit1+unit2;
    }
}
