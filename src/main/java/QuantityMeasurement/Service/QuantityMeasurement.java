package QuantityMeasurement.Service;

public class QuantityMeasurement {

    private static int feetToInchConversionFactor = 12;
    private static double yardToFeetConversionFactor = 3;
    private static double yardToInchConversionFactor = 36;

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

    public static boolean convertYardToInch(double yard, double inches) {
        if (inches == yardToInchConversionFactor * yard) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean convertInchToYard(double inches, double yard) {
        if (yard == inches/yardToInchConversionFactor) {
            return true;
        } else {
            return false;
        }
    }

}
