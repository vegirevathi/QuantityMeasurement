package QuantityMeasurement.Service;

public class QuantityMeasurement {

    private static int feetToInchConversionFactor = 12;

    public static boolean convertFeetToInch(double feet, double inches) {
        if (inches == feetToInchConversionFactor * feet) {
            return true;
        } else {
            return false;
        }
    }
}
