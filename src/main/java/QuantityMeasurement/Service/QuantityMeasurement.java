package QuantityMeasurement.Service;

public class QuantityMeasurement {
    public int FEET_TO_INCHES_CONVERSION_FACTOR = 12;

    public double convertFeetToInch(double feet) {
        return feet * FEET_TO_INCHES_CONVERSION_FACTOR;
    }
}
