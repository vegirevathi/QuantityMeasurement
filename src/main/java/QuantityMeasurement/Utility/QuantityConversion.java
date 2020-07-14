package QuantityMeasurement.Utility;

public enum QuantityConversion {
    FEET_TO_INCH(12),
    YARD_TO_FEET(3),
    YARD_TO_INCH(36),
    INCH_TO_YARD(0.0277),
    FEET_TO_YARD(0.333);

    public final double CONVERSION_FACTOR;

    QuantityConversion(double CONVERSION_FACTOR) {
        this.CONVERSION_FACTOR = CONVERSION_FACTOR;
    }

}
