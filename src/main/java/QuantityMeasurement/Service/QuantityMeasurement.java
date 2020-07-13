package QuantityMeasurement.Service;

public class QuantityMeasurement {

    private static int feetToInchConversionFactor = 12;
    private static double yardToFeetConversionFactor = 3;

    public static boolean convertFeetToInch(double feet, double inches) {
        if (inches == feetToInchConversionFactor * feet) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean convertYardToFeet(double yard, double feet) {
        if (feet == yardToFeetConversionFactor * yard) {
            return true;
        } else {
            return false;
        }
    }

}
